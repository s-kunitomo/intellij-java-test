package com.shoji.model;

public class Article
{
    public Article(String id, String title, String url, User user)
    {
        this.id = id;
        this.title = title;
        this.url = url;
        this.user = user;
    }

    private String id;
    private String title;
    private String url;
    private User user;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getUrl()
    {
        return this.url;
    }

    public void setUrl(String profileImageUrl)
    {
        this.url = url;
    }

    public User getUser()
    {
        return this.user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}