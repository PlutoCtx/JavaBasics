package com.example.object.oop.innerclass;

/**
 * 静态内部类的单例模式
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:05
 */

public class StaticInnerClassSingleton {
    /**
     * 私有化构造器
     */
    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClassSingletonHolder.INSTANCE;
    }

    private static class StaticInnerClassSingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

}
