package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extensible;

/**
 * Callable element
 */
@Extensible
public interface ICallable
{

    /**
     * Execute the call
     */
    void execute();
}
