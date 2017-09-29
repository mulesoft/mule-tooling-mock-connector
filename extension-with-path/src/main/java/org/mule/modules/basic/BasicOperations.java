package org.mule.modules.basic;

import static org.mule.runtime.api.meta.model.display.PathModel.Type.DIRECTORY;
import static org.mule.runtime.api.meta.model.display.PathModel.Type.FILE;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.Path;

public class BasicOperations
{

    /**
     * Operation with all paths supported
     *
     * @param directoryPath
     * @param filePath
     * @param anyPath
     * @param urlPath
     * @return
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithPaths(@Path(type = DIRECTORY) String directoryPath,
                                      @Path(type = FILE, acceptedFileExtensions = {"txt", "md"}) String filePath,
                                      @Path String anyPath,
                                      @Path(acceptsUrls = true) String urlPath)
    {
        return "";
    }

}
