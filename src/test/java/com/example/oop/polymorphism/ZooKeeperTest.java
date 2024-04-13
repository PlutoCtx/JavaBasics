package com.example.oop.polymorphism;


import com.example.object.oop.polymorphism.*;

/**
 * 多态的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 21:45
 */

public class ZooKeeperTest {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Animal animal = new Monkey("金丝猴");
        Food food = new Banana("香蕉");
        zooKeeper.feed(animal,food);

        //向下转型
        Monkey monkey = (Monkey)animal;
        monkey.play();


        /*
            instanceof运算符
         */
        if (animal instanceof Tiger){
            //解决类型转化异常
            Tiger tiger = (Tiger) animal;
        }
        //类型转化异常
        //java.lang.ClassCastException
        //Tiger tiger = (Tiger) animal;


        animal = new Tiger("东北虎");
        food = new Meat("野猪肉");
        zooKeeper.feed(animal,food);

        animal = new Tiger("长颈鹿");
        food = new Grass("草");
        zooKeeper.feed(animal,food);

        //形参多态和返回值多态的使用
        Animal animalReturnValue = zooKeeper.getAnimal(monkey);
        System.out.println("动物的信息: " + animalReturnValue.getName());





    }

}
