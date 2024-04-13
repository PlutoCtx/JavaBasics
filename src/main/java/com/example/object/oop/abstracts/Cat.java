package com.example.object.oop.abstracts;

/**
 * cat
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:28
 */

public class Cat extends Animal {

    public Cat(){}

    public Cat(String nationality){
        super(nationality);

    }





    /**
     * 动物吃东西
     * 子类重写父类的抽象方法
     */
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep(String nationality) {
        System.out.println(nationality + "小猫在睡觉");
    }
}
