/**
 *
 */
package org.mule.modules.mockdynamic;

import org.mule.api.MuleContext;
import org.mule.api.registry.MuleRegistry;
import org.mule.common.Result;
import org.mule.common.TestResult;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.DefinedMapMetaDataModel;
import org.mule.common.metadata.ListMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.builder.DefaultMetaDataBuilder;
import org.mule.common.metadata.datatype.DataType;
import org.mule.modules.mockdynamic.connectivity.MockDynamicConnectorConnectionManager;
import org.mule.modules.mockdynamic.processors.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockDynamicMetaDataIntegrationTest
{

    private String username = "username";
    private String password = "password";

    @Test
    public void testGetMetadata()
    {
        MockDynamicConnector pojoConnector = new MockDynamicConnector();
        MetaData metaData = pojoConnector.getMetaData(new DefaultMetaDataKey("User", "User"));
        Assert.assertNotNull(metaData);
    }

    @Test
    public void testQueryOutputMetadata() throws Exception
    {
        QueryMessageProcessor query = new QueryMessageProcessor("query");
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockDynamicConnectorConnectionManager mockPojoConnectorConnectionManager = new MockDynamicConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockDynamicConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        query.setMuleContext(muleContext);

        query.setQuery("dsql:select Name from User");
        Result<MetaData> outputMetaData = query.getOutputMetaData(null);
        org.junit.Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.instanceOf(ListMetaDataModel.class));
        org.junit.Assert.assertThat(((ListMetaDataModel) outputMetaData.get().getPayload()).getElementModel(), CoreMatchers.instanceOf(DefinedMapMetaDataModel.class));
        org.junit.Assert.assertThat(((DefinedMapMetaDataModel) ((ListMetaDataModel) outputMetaData.get().getPayload()).getElementModel()).getName(), CoreMatchers.is("User"));
    }


    @Test
    public void testConnectivity()
    {

        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);
        MockDynamicConnectorConnectionManager mockPojoConnectorConnectionManager = new MockDynamicConnectorConnectionManager();
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

        MockDynamicConnectorConnectionManager mockPojoConnectorConnectionManager = new MockDynamicConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockDynamicConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        query.setMuleContext(muleContext);

        query.setQuery("dsql:select Name from User");
        Result<MetaData> outputMetaData = query.getOutputMetaData(null);
        org.junit.Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.instanceOf(DefinedMapMetaDataModel.class));

        org.junit.Assert.assertThat(((DefinedMapMetaDataModel) outputMetaData.get().getPayload()).getName(), CoreMatchers.is("User"));
    }


    @Test
    public void testGetClientFromAccount() throws Exception
    {
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        GetClientFromAccountMessageProcessor getClient = new GetClientFromAccountMessageProcessor("get-client-from-account");
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockDynamicConnectorConnectionManager mockPojoConnectorConnectionManager = new MockDynamicConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockDynamicConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        getClient.setMuleContext(muleContext);
        getClient.setAccount(new DefaultMetaDataBuilder().
                createDynamicObject("Account")
                .addSimpleField("Name", DataType.STRING)
                .addSimpleField("Id", DataType.STRING)
                .addSimpleField("State", DataType.STRING).build());

        Result<MetaData> outputMetaData = getClient.getOutputMetaData(null);

        org.junit.Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.instanceOf(DefinedMapMetaDataModel.class));
        org.junit.Assert.assertThat(((DefinedMapMetaDataModel) outputMetaData.get().getPayload()).getName(), CoreMatchers.is("Client"));
    }


    @Test
    public void testGetClient() throws Exception
    {
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        GetClientMessageProcessor getClient = new GetClientMessageProcessor("get-client");
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockDynamicConnectorConnectionManager mockPojoConnectorConnectionManager = new MockDynamicConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockDynamicConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        getClient.setMuleContext(muleContext);
        getClient.setId("MyClientId");

        Result<MetaData> outputMetaData = getClient.getOutputMetaData(null);

        org.junit.Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.instanceOf(DefinedMapMetaDataModel.class));
        org.junit.Assert.assertThat(((DefinedMapMetaDataModel) outputMetaData.get().getPayload()).getName(), CoreMatchers.is("Client"));
    }

    @Test
    public void testCreateAndGetClient() throws Exception
    {
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        CreateAndGetClientMessageProcessor createAndGetClient = new CreateAndGetClientMessageProcessor("create-and-get-client");
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockDynamicConnectorConnectionManager mockPojoConnectorConnectionManager = new MockDynamicConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockDynamicConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        createAndGetClient.setMuleContext(muleContext);
        createAndGetClient.setClient(new DefaultMetaDataBuilder().
                        createDynamicObject("Client")
                        .addSimpleField("Name", DataType.STRING)
                        .addSimpleField("Last Name", DataType.STRING)
                        .addSimpleField("Age", DataType.INTEGER).build());

        Result<MetaData> outputMetaData = createAndGetClient.getOutputMetaData(null);

        org.junit.Assert.assertThat(outputMetaData.get().getPayload(), CoreMatchers.instanceOf(DefinedMapMetaDataModel.class));
        org.junit.Assert.assertThat(((DefinedMapMetaDataModel) outputMetaData.get().getPayload()).getName(), CoreMatchers.is("Client"));


    }


}
