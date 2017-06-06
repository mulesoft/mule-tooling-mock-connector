package org.mule.modules.basic;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.execution.OnError;
import org.mule.runtime.extension.api.annotation.execution.OnSuccess;
import org.mule.runtime.extension.api.annotation.execution.OnTerminate;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.source.EmitsResponse;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

/**
 * Basic Source javadoc description
 */
@EmitsResponse
public class AnotherSource extends Source<String, BasicAttributes>
{

    @Config
    private BasicExtensionConfig config;
    /**
     * Source Parameter description
     */
    @Parameter
    private String anotherSourceParameter;

    @Override
    public void onStart(SourceCallback<String, BasicAttributes> sourceCallback) throws MuleException
    {

    }

    @Override
    public void onStop()
    {

    }

    @OnSuccess
    public void logSuccess(String message)
    {

    }

    @OnError
    public void logError(String message, String details)
    {

    }

    @OnTerminate
    public void onTerminate(){

    }
}
