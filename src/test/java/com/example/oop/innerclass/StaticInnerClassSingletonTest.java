package com.example.oop.innerclass;

import com.example.object.oop.innerclass.StaticInnerClassSingleton;

/**
 * 静态内部类的单例模式测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:13
 */

public class StaticInnerClassSingletonTest {

    public static void main(String[] args) {
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
    }
}
