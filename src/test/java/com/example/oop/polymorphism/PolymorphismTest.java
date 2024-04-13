package com.example.oop.polymorphism;

import com.example.object.oop.abstracts.Animal;
import com.example.object.oop.abstracts.Cat;
import com.example.object.oop.abstracts.Panda;

/**
 * 多态的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:51
 */

public class PolymorphismTest {
    public static void main(String[] args) {
        //父类的引用引向子类的对象
        Animal animal = new Cat();
        animal.eat();

        animal = new Panda();
        animal.eat();

    }

}
