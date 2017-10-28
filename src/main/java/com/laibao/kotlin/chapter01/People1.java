package com.laibao.kotlin.chapter01;


public class People1 {
    private String name;
    private String passWord;
    private int age;

    public People1(String name, String passWord, int age) {
        this.name = name;
        this.passWord = passWord;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
