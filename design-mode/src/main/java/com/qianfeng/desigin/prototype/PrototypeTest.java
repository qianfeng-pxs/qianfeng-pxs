package com.qianfeng.desigin.prototype;

import java.util.Date;

public class PrototypeTest {
    public static void main(String[] args) {
        try {
            Person person = new Person("张三", "男", new Date());
            Person personClone = person.clone();
            System.out.println("person1:" + person);
            System.out.println("personClone:" + personClone);

            System.out.println("person1 == personClone?:" + (person == personClone));
            System.out.println("person.getBirthDay == personClone.getBirthDay?:" + (personClone.getBirthDay() == person.getBirthDay()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
