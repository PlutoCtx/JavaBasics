package com.example.object.oop.polymorphism;

/**
 * 长颈鹿
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:20
 */

public class Giraffe extends Animal{
    public Giraffe(String name){
        super(name);
    }

    @Override
    public void eat(Food food){
        System.out.println(this.getName() + "正在吃" + food.getName());
    }
}
