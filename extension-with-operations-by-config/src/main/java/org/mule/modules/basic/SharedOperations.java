package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;

/**
 * Operations that can be used with any config
 */
public class SharedOperations
{

    /**
     * Hello world
     * @param message A message
     */
    public void helloWorld(@UseConfig BaseConfig config, String message){

    }
}
