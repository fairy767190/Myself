package com.ithema.demo01;

import java.sql.SQLOutput;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("com.ithema.demo01.Person");
        System.out.println(aClass);
        System.out.println(Person.class);

        Person p = new Person();
        System.out.println(p.getClass());
        System.out.println(aClass == Person.class);
        System.out.println(aClass == p.getClass());
    }
}

