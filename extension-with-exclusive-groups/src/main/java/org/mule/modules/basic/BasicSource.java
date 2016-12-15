package org.mule.modules.basic;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

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

    @ParameterGroup("Exclusive Group")
    ExclusiveOptionalGroup basicGroup;

    @Override
    public void onStart(SourceCallback<String, BasicAttributes> sourceCallback) throws MuleException
    {

    }

    @Override
    public void onStop()
    {

    }
}
