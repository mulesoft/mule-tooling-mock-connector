package org.mule.modules.soap;

import static com.google.common.collect.Lists.newArrayList;
import static org.mule.modules.soap.Services.values;
import static org.mule.runtime.extension.api.soap.WebServiceDefinition.builder;
import org.mule.runtime.extension.api.soap.SoapServiceProvider;
import org.mule.runtime.extension.api.soap.WebServiceDefinition;
import org.mule.runtime.extension.api.soap.security.SecurityStrategy;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class BasicServiceProvider implements SoapServiceProvider
{

    @Override
    public List<WebServiceDefinition> getWebServiceDefinitions()
    {
        List<WebServiceDefinition> result = newArrayList();
        for (ServiceDefinition service : generateServicesDefinitions())
        {
            final URL resource = this.getClass().getClassLoader().getResource("wsdl/" + service.getId()+".wsdl");
            result.add(builder()
                               .withId(service.getId())
                               .withFriendlyName(service.getDisplayName())
                               .withWsdlUrl(resource)
                               .withAddress("http://fruta.com")
                               .withService(service.getService())
                               .withPort(service.getPort())
                               .build());
        }
        return result;
    }

    @Override
    public List<SecurityStrategy> getSecurities()
    {
        return new ArrayList<>();
    }

    protected List<ServiceDefinition> generateServicesDefinitions()
    {
        List<ServiceDefinition> availableServices = newArrayList();
        for (Services service : values())
        {
            availableServices.add(new ServiceDefinition(service.getName()));
        }
        return availableServices;
    }

}
