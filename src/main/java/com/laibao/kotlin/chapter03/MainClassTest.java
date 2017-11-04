package com.laibao.kotlin.chapter03;

/**
 * Created by jinge on 2017/11/4.
 */
public class MainClassTest {

    public static void main(String[] args) {
        Person person = new Person("汪","来宝",100);
        System.out.println(String.format("%s%s is %d age old",person.getFirstName(),person.getLastName(),person.getAge()));
    }
}
