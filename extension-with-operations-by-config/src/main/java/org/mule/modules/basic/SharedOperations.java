package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

/**
 * Operations that can be used with any config
 */
public class SharedOperations
{

    /**
     * Hello world
     * @param message A message
     */
    @MediaType(MediaType.APPLICATION_PLAIN)
    public void helloWorld(@Config BaseConfig config, String message){

    }
}
