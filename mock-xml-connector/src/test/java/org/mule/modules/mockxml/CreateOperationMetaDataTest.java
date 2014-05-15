/**
 *
 */
package org.mule.modules.mockxml;

import org.mule.api.MuleContext;
import org.mule.api.registry.MuleRegistry;
import org.mule.common.Result;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.XmlMetaDataModel;
import org.mule.modules.mockxml.connectivity.MockXmlConnectorConnectionManager;
import org.mule.modules.mockxml.processors.CreateMessageProcessor;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

public class CreateOperationMetaDataTest
{

    private String username = "username";
    private String password = "password";


    @Test
    public void testCreateInputMetadata() throws Exception
    {
        CreateMessageProcessor create = new CreateMessageProcessor("create");
        MuleContext muleContext = Mockito.mock(MuleContext.class);
        MuleRegistry muleRegistry = Mockito.mock(MuleRegistry.class);
        Mockito.when(muleContext.getRegistry()).thenReturn(muleRegistry);

        MockXmlConnectorConnectionManager mockPojoConnectorConnectionManager = new MockXmlConnectorConnectionManager();
        mockPojoConnectorConnectionManager.setUsername(username);
        mockPojoConnectorConnectionManager.setPassword(password);
        mockPojoConnectorConnectionManager.setMuleContext(muleContext);
        mockPojoConnectorConnectionManager.initialise();

        Mockito.when(muleRegistry.lookupObject(MockXmlConnectorConnectionManager.class)).thenReturn(mockPojoConnectorConnectionManager);

        create.setType("items");
        create.setMuleContext(muleContext);

        Result<MetaData> outputMetaData = create.getInputMetaData();

        org.junit.Assert.assertThat((outputMetaData.get().getPayload()), CoreMatchers.is(XmlMetaDataModel.class));
        org.junit.Assert.assertThat(((XmlMetaDataModel) (outputMetaData.get().getPayload())).getRootElement().getLocalPart(), CoreMatchers.is("items"));
    }


}
