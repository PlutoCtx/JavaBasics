package com.example.object.oop.abstracts;

/**
 * panda
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:28
 */

public class Panda extends Animal {

    public Panda(){}

    public Panda(String nationality){
        super(nationality);

    }





    @Override
    public void eat() {
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void sleep(String nationality) {
        System.out.println(nationality + "熊猫在睡觉");
    }
}
