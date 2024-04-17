package com.example.oop.innerclass;

import com.example.object.oop.abstracts.Animal;

/**
 * 匿名内部类测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:11
 */

public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        //匿名内部类 没有名字的局部内部类
        Animal animal = new Animal(){
            @Override
            public void eat() {
                System.out.println("大熊猫在吃竹子");
            }
            @Override
            public void sleep(String nationality) {
                System.out.println(nationality + "大熊猫正在睡觉");
            }
        };

        animal.eat();
        animal.sleep("中国四川");
    }
}
