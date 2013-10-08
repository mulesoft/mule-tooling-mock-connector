/**
 *
 */
package org.mule.modules.mockpojo;

import org.mule.api.MuleContext;
import org.mule.api.registry.MuleRegistry;
import org.mule.common.Result;
import org.mule.common.TestResult;
import org.mule.common.metadata.ListMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataField;
import org.mule.common.metadata.PojoMetaDataModel;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.field.property.dsql.DsqlOrderMetaDataFieldProperty;
import org.mule.common.metadata.field.property.dsql.DsqlQueryOperatorsMetaDataFieldProperty;
import org.mule.common.metadata.field.property.dsql.DsqlSelectMetaDataFieldProperty;
import org.mule.common.metadata.field.property.dsql.DsqlWhereMetaDataFieldProperty;
import org.mule.common.query.expression.Operator;
import org.mule.modules.mockpojo.connectivity.MockPojoConnectorConnectionManager;
import org.mule.modules.mockpojo.processors.QueryMessageProcessor;
import org.mule.modules.mockpojo.processors.QuerySingleMessageProcessor;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class QueryOperationMetaDataTest
{

    private String username = "username";
    private String password = "password";

    @Test
    public void testGetMetadata()
    {
        MockPojoConnector pojoConnector = new MockPojoConnector();
        MetaData metaData = pojoConnector.getMetaData(pojoConnector.createEveythingPojoKey());
        Assert.assertNotNull(metaData);
    }

    @Test
    public void testQueryOutputMetadata() throws Exception
    {
        QueryMessageProcessor query = new QueryMessageProcessor("query");
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockPojoConnectorConnectionManager mockPojoConnectorConnectionManager = new MockPojoConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockPojoConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        query.setMuleContext(muleContext);

        query.setQuery("dsql:select primitiveInt from " + EverythingPojo.class.getSimpleName() + "");
        Result<MetaData> outputMetaData = query.getOutputMetaData(null);
        org.junit.Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.is(ListMetaDataModel.class));
        org.junit.Assert.assertThat(((ListMetaDataModel) outputMetaData.get().getPayload()).getElementModel(), CoreMatchers.is(PojoMetaDataModel.class));
        org.junit.Assert.assertThat(((PojoMetaDataModel) ((ListMetaDataModel) outputMetaData.get().getPayload()).getElementModel()).getClassName(), CoreMatchers.is(EverythingPojo.class.getName()));
    }


    @Test
    public void testConnectivity()
    {

        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);
        MockPojoConnectorConnectionManager mockPojoConnectorConnectionManager = new MockPojoConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();
        TestResult test = mockPojoConnectorConnectionManager.test();
        Assert.assertThat(test.getStatus(), CoreMatchers.is(Result.Status.SUCCESS));

    }

    @Test
    public void testQuerySingleOutputMetadata() throws Exception
    {
        QuerySingleMessageProcessor query = new QuerySingleMessageProcessor("query-single");
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockPojoConnectorConnectionManager mockPojoConnectorConnectionManager = new MockPojoConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockPojoConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        query.setMuleContext(muleContext);

        query.setQuery("dsql:select primitiveInt from " + EverythingPojo.class.getSimpleName() + "");
        Result<MetaData> outputMetaData = query.getOutputMetaData(null);
        org.junit.Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.is(PojoMetaDataModel.class));

        PojoMetaDataModel payload = (PojoMetaDataModel) outputMetaData.get().getPayload();
        org.junit.Assert.assertThat(payload.getClassName(), CoreMatchers.is(EverythingPojo.class.getName()));
        List<MetaDataField> fields = payload.getFields();
        Assert.assertThat(fields.size(), CoreMatchers.is(17));
        for (MetaDataField field : fields)
        {
            Assert.assertThat(field.hasProperty(DsqlOrderMetaDataFieldProperty.class), CoreMatchers.is(true));
            Assert.assertThat(field.hasProperty(DsqlWhereMetaDataFieldProperty.class), CoreMatchers.is(true));
            Assert.assertThat(field.hasProperty(DsqlSelectMetaDataFieldProperty.class), CoreMatchers.is(true));

            List<Operator> supportedOperators = field.getProperty(DsqlQueryOperatorsMetaDataFieldProperty.class).getSupportedOperators();
            if (field.getMetaDataModel().getDataType() != DataType.POJO)
            {
                Assert.assertThat("Fields " + field.getName() + " has empty operators", supportedOperators.isEmpty(), CoreMatchers.is(false));
            }
        }
    }

}
