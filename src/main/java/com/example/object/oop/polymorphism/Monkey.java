package com.example.object.oop.polymorphism;

/**
 * 多态
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:21
 */

public class Monkey extends Animal{
    public Monkey(String name){
        super(name);
    }

    @Override
    public void eat(Food food){
        System.out.println(this.getName() + "正在吃" + food.getName());
    }

    public void play(){
        System.out.println(this.getName() + "正在玩杂耍");
    }


}
