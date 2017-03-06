package org.mule.modules.basic;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

import java.io.InputStream;

/**
 * Basic Source with Streamming
 */
public class BasicSource extends Source<InputStream,BasicAttributes>
{

    @UseConfig
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
