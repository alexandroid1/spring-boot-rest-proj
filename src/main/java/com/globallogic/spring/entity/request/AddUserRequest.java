package com.globallogic.spring.entity.request;

import java.util.Date;

/**
 * Created by ALEX on 31.05.2016.
 */
public class AddUserRequest {

    private String name;

    private String address;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }




}
