package org.mule.modules.basic;

import static org.mule.runtime.api.meta.model.display.PathModel.Type.DIRECTORY;
import static org.mule.runtime.api.meta.model.display.PathModel.Type.FILE;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Path;

public class PojoWithPaths
{
    @Path(type = DIRECTORY)
    @Parameter
    private String directoryPathAtPojo;

    @Path(type = FILE, acceptedFileExtensions = {"txt", "md"})
    @Parameter
    private String filePathAtPojo;
    @Path
    @Parameter
    private String anyPathAtPojo;

    @Path(acceptsUrls = true)
    @Parameter
    private String urlPathAtPojo;

    public String getDirectoryPathAtPojo()
    {
        return directoryPathAtPojo;
    }

    public void setDirectoryPathAtPojo(String directoryPathAtPojo)
    {
        this.directoryPathAtPojo = directoryPathAtPojo;
    }

    public String getFilePathAtPojo()
    {
        return filePathAtPojo;
    }

    public void setFilePathAtPojo(String filePathAtPojo)
    {
        this.filePathAtPojo = filePathAtPojo;
    }

    public String getAnyPathAtPojo()
    {
        return anyPathAtPojo;
    }

    public void setAnyPathAtPojo(String anyPathAtPojo)
    {
        this.anyPathAtPojo = anyPathAtPojo;
    }

    public String getUrlPathAtPojo()
    {
        return urlPathAtPojo;
    }

    public void setUrlPathAtPojo(String urlPathAtPojo)
    {
        this.urlPathAtPojo = urlPathAtPojo;
    }
}
