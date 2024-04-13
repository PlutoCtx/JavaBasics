package com.example.object.oop.polymorphism;

/**
 * 食物
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:19
 */

public class Food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }
}
