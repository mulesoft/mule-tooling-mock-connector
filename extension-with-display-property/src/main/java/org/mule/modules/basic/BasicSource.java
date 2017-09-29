package org.mule.modules.basic;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

/**
 * Basic Source javadoc description
 */
@DisplayName("Custom source label")
@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
public class BasicSource extends Source<String,BasicAttributes>
{

    @Config
    private BasicExtensionConfig config;
    /**
     * Source Parameter description
     */
    @Parameter
    private String sourceParameter;

    @Override
    public void onStart(SourceCallback<String, BasicAttributes> sourceCallback) throws MuleException
    {

    }

    @Override
    public void onStop()
    {

    }
}
