package com.shoji.model;

public class User
{
    public User(String id, String name, String profileImageUrl)
    {
        this.id = id;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
    }

    private String id;
    private String name;
    private String profileImageUrl;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPofileImageUrl()
    {
        return this.profileImageUrl;
    }

    public void setPofileImageUrl(String profileImageUrl)
    {
        this.profileImageUrl = profileImageUrl;
    }
}