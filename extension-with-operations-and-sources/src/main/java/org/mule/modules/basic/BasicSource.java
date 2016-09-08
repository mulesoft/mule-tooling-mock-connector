package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.source.Source;

/**
 * Basic Source javadoc description
 */
public class BasicSource extends Source<String,BasicAttributes>
{

    @UseConfig
    private BasicExtensionConfig config;

    /**
     * Source Parameter description
     */
    @Parameter
    private String sourceParameter;

    @Override
    public void start() throws Exception
    {

    }

    @Override
    public void stop() throws Exception
    {

    }
}
