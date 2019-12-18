package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private String  username;
    private Date birthday;
    private String userSex;
    private String address;

    public User() {
    }

    public User(Integer id, String username, Date birthday, String userSex, String address) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.userSex = userSex;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getuserSex() {
        return userSex;
    }

    public void setuserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", userSex='" + userSex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
