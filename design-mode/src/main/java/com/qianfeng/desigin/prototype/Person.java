package com.qianfeng.desigin.prototype;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Cloneable {
    private String name;
    private String sex;
    private Date birthDay;


    public Person(String name, String sex, Date birthDay) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDay=" + new SimpleDateFormat("yyyy-MM-dd").format(birthDay) +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.birthDay = (Date) clone.birthDay.clone();
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
