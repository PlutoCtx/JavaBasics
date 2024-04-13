package com.example.object.oop.polymorphism;

/**
 * 动物管理员
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:21
 */

public class ZooKeeper {


    /**
     * 动物管理员给动物投食
     * @param animal
     * @param food
     */
    public void feed(Animal animal,Food food){
        animal.eat(food);
    }

    /**
     * 获取动物信息
     * @param animal
     * @return
     */
    public Animal getAnimal(Animal animal){
        return animal;
    }


}
