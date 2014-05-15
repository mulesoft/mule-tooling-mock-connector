/**
 *
 */
package org.mule.modules.mockpojo;

import org.mule.api.MuleContext;
import org.mule.api.registry.MuleRegistry;
import org.mule.common.Result;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.PojoMetaDataModel;
import org.mule.modules.mockpojo.connectivity.MockPojoConnectorConnectionManager;
import org.mule.modules.mockpojo.processors.GetMessageProcessor;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GetOperationMetaDataTest
{

    private String username = "username";
    private String password = "password";


    @Test
    public void testGetOperationOutputMetadata() throws Exception
    {
        GetMessageProcessor create = new GetMessageProcessor("get");
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockPojoConnectorConnectionManager mockPojoConnectorConnectionManager = new MockPojoConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockPojoConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        create.setType(EverythingPojo.class.getSimpleName());
        create.setMuleContext(muleContext);


        Result<MetaData> outputMetaData = create.getOutputMetaData(null);

        org.junit.Assert.assertThat((outputMetaData.get().getPayload()), CoreMatchers.is(PojoMetaDataModel.class));
        org.junit.Assert.assertThat(((PojoMetaDataModel) (outputMetaData.get().getPayload())).getClassName(), CoreMatchers.is(EverythingPojo.class.getName()));
    }
}
