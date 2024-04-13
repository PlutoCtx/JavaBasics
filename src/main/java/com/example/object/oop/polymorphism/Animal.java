package com.example.object.oop.polymorphism;

/**
 * 动物类
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:19
 */

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }


    public abstract void eat(Food food);

}
