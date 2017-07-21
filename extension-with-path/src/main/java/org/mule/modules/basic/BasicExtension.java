package org.mule.modules.basic;

import static org.mule.runtime.api.meta.model.display.PathModel.Type.DIRECTORY;
import static org.mule.runtime.api.meta.model.display.PathModel.Type.FILE;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Path;

/**
 * Extension javadoc description
 */
@Extension(name = "Path", description = "Basic Connector with @Path")
@Operations({BasicOperations.class})
public class BasicExtension
{

    @Path(type = DIRECTORY)
    @Parameter
    String directoryPath;

    @Path(type = FILE, acceptedFileExtensions = {"txt", "md"})
    @Parameter
    String filePath;
    @Path
    @Parameter
    String anyPath;

    @Path(acceptsUrls = true)
    @Parameter
    String urlPath;

}
