package com.example.oop.abstracts.template;

import com.example.object.oop.abstracts.Cat;
import com.example.object.oop.abstracts.Panda;

/**
 * 抽象类测试
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:07
 */

public class AbstractClassTest {

    public static void main(String[] args) {
        //抽象类不能实例化
        //Animal  animal = new Animal();

        Cat cat = new Cat();
        cat.eat();

        Panda panda = new Panda();
        panda.eat();

        Panda china = new Panda("中国");
        china.sleep(china.getNationality());

        Cat iran = new Cat("伊朗");
        iran.sleep(iran.getNationality());
    }
}
