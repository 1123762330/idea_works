package com.itheima.domain;

import java.io.Serializable;

public class Role implements Serializable {
    private  int ID;
    private  String ROLE_NAME;
    private  String ROLE_DESC;

    public Role() {
    }

    public Role(int ID, String ROLE_NAME, String ROLE_DESC) {
        this.ID = ID;
        this.ROLE_NAME = ROLE_NAME;
        this.ROLE_DESC = ROLE_DESC;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getROLE_NAME() {
        return ROLE_NAME;
    }

    public void setROLE_NAME(String ROLE_NAME) {
        this.ROLE_NAME = ROLE_NAME;
    }

    public String getROLE_DESC() {
        return ROLE_DESC;
    }

    public void setROLE_DESC(String ROLE_DESC) {
        this.ROLE_DESC = ROLE_DESC;
    }

    @Override
    public String toString() {
        return "Role{" +
                "ID=" + ID +
                ", ROLE_NAME='" + ROLE_NAME + '\'' +
                ", ROLE_DESC='" + ROLE_DESC + '\'' +
                '}';
    }
}
