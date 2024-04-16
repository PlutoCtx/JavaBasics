package com.example.api.lang;

import java.util.logging.Logger;

/**
 * JavaBasics
 * 线程创建和启动的两种方式
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/16 9:20
 * @since JDK17
 */

public class ThreadCreateStartTest {

    /**
     * main方法也是一个线程，即主线程
     * 主线程有JVM创建
     * JVM启动的时候，还创建了一些其他的线程
     * @param args
     */
    public static void main(String[] args) {
//        // 创建Thread类的子类对象
//        CustomThread customThread = new CustomThread();
//        // 调用Thread类的start()方法
//        customThread.start();

        Thread thread = new Thread(new CustomRunnable());
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i = " + i);
        }

        // 匿名内部类的方式创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
                Logger.getGlobal().info("Logger：匿名内部类创建线程");
            }
        }).start();

        // lambda表达式建线程
        new Thread(() -> {
            System.out.println("匿名内部类创建线程");
            Logger.getGlobal().info("Logger：匿名内部类创建线程");
        }).start();

    }
}

/**
 * 第一种创建线程的方式
 * 继承Thread类 重写run方法
 */
class CustomThread extends Thread {
    /**
     *
     */
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j = " + j);
        }
    }
}

/**
 * 第二种实现线程的方式
 * 实现Runnable接口，重写run方法
 */
class CustomRunnable implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j = " + j);
        }
    }
}
