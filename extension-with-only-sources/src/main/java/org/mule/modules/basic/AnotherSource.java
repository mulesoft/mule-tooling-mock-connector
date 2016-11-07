package org.mule.modules.basic;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.execution.OnError;
import org.mule.runtime.extension.api.annotation.execution.OnSuccess;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;
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
    public void onStart(SourceCallback<String, BasicAttributes> sourceCallback) throws MuleException
    {

    }

    @Override
    public void onStop()
    {

    }

    @OnSuccess
    public void logSuccess( String message){

    }

    @OnError
    public void logError( String message, String details){

    }
}
