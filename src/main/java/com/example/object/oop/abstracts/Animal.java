package com.example.object.oop.abstracts;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:27
 */

public abstract class Animal {

    /**
     * 国籍
     */
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    /**
     * 抽象类构造方法的作用给子类继承的成员赋值
     */
    public Animal() {
    }


    public Animal(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 动物吃东西
     */
    public abstract void eat();


    public abstract void sleep(String nationality);
}
