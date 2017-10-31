package com.laibao.kotlin.chapter01;


public class MyDataJavaTest {

    public static void main(String[] args) {
        MyData data = new MyData("Jinge",120);

        System.out.println(data.getName());
        System.out.println(data.getAge());
        System.out.println(data.getGrade());
        //data.setGrade(20000);
        System.out.println();
        System.out.println();
        data.setGrade(1000);
        System.out.println(data.getGrade());

        KotlinNutritionFacts2 kotlinNutritionFacts2 = new KotlinNutritionFacts2(0,100,12,34,345,345);
    }
}
