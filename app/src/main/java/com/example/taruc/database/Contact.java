package com.example.taruc.database;

/**
 * Created by taruc on 17/1/2018.
 */

public class Contact {
    int id;
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber)
    {
        this.phoneNumber = phoneNumber;

    }
    public Contact(int id, String name, String phoneNumber)
    {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }


}
