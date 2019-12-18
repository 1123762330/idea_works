package cn.itheima.test2.entity;

import java.sql.Date;

public class Contact {
    private Integer id;
    private String name;
    private Character gender;
    private Date date;
    private String telephone;
    private String city;

    public Contact() {
    }

    public Contact(Integer id, String name, Character gender, Date date, String telephone, String city) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.telephone = telephone;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", date=" + date +
                ", telephone='" + telephone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
