package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.source.Source;

/**
 * Basic Source javadoc description
 */
public class AnotherSource extends Source<String,BasicAttributes>
{

    @UseConfig
    private BasicExtensionConfig config;
    /**
     * Source Parameter description
     */
    @Parameter
    private String anotherSourceParameter;

    @Override
    public void start() throws Exception
    {

    }

    @Override
    public void stop() throws Exception
    {

    }
}
