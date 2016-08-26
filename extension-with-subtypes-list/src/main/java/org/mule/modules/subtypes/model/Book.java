package org.mule.modules.subtypes.model;

public class Book extends BasePojo
{
    private Integer pages;
    private String author;

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Integer getPages()
    {
        return pages;
    }

    public void setPages(Integer pages)
    {
        this.pages = pages;
    }
}
