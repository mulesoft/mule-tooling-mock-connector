/**
 * (c) 2003-2017 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1 a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.soap;

public class ServiceDefinition
{

    private final String id;
    private final String displayName;
    private final String port;
    private final String service;

    public ServiceDefinition(String serviceName)
    {
        this.id = serviceName;
        this.displayName = serviceName.replace('_', ' ');
        this.port = serviceName;
        this.service = serviceName.concat("Service");
    }

    public String getId()
    {
        return id;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getService()
    {
        return service;
    }

    public String getPort()
    {
        return port;
    }


}
