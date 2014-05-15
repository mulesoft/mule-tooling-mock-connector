/**
 *
 */
package org.mule.modules.mockxml;

import org.mule.api.MuleContext;
import org.mule.api.registry.MuleRegistry;
import org.mule.common.Result;
import org.mule.common.TestResult;
import org.mule.common.metadata.ListMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.XmlMetaDataModel;
import org.mule.modules.mockxml.connectivity.MockXmlConnectorConnectionManager;
import org.mule.modules.mockxml.processors.QueryMessageProcessor;
import org.mule.modules.mockxml.processors.QuerySingleMessageProcessor;

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
        MockXmlConnector pojoConnector = new MockXmlConnector();
        MetaData metaData = pojoConnector.getMetaData(pojoConnector.createItemKey());
        Assert.assertNotNull(metaData);
    }

    @Test
    public void testQueryOutputMetadata() throws Exception
    {
        QueryMessageProcessor query = new QueryMessageProcessor("query");
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockXmlConnectorConnectionManager mockPojoConnectorConnectionManager = new MockXmlConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockXmlConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        query.setMuleContext(muleContext);

        query.setQuery("dsql:select primitiveInt from " + "item" + "");
        Result<MetaData> outputMetaData = query.getOutputMetaData(null);
        Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.is(ListMetaDataModel.class));
        Assert.assertThat(((ListMetaDataModel) outputMetaData.get().getPayload()).getElementModel(), CoreMatchers.is(XmlMetaDataModel.class));
        Assert.assertThat(((XmlMetaDataModel) ((ListMetaDataModel) outputMetaData.get().getPayload()).getElementModel()).getRootElement().getLocalPart(), CoreMatchers.is("item"));
    }


    @Test
    public void testConnectivity()
    {

        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);
        MockXmlConnectorConnectionManager mockPojoConnectorConnectionManager = new MockXmlConnectorConnectionManager();
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

        MockXmlConnectorConnectionManager mockPojoConnectorConnectionManager = new MockXmlConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockXmlConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        query.setMuleContext(muleContext);

        query.setQuery("dsql:select primitiveInt from " + "items" + "");
        Result<MetaData> outputMetaData = query.getOutputMetaData(null);
        Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.is(XmlMetaDataModel.class));

        XmlMetaDataModel payload = (XmlMetaDataModel) outputMetaData.get().getPayload();
        Assert.assertThat(payload.getRootElement().getLocalPart(), CoreMatchers.is("items"));

    }

}
