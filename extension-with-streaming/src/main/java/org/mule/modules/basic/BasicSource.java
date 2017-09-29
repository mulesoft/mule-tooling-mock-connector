package org.mule.modules.basic;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

import java.io.InputStream;

/**
 * Basic Source with Streamming
 */
@MediaType(MediaType.APPLICATION_PLAIN)
public class BasicSource extends Source<InputStream,BasicAttributes>
{

    @Config
    private BasicExtensionConfig config;

    /**
     * Source Parameter description
     */
    @Parameter
    private String sourceParameter;

    @Override
    public void onStart(SourceCallback<InputStream, BasicAttributes> sourceCallback) throws MuleException
    {

    }

    @Override
    public void onStop()
    {

    }
}
