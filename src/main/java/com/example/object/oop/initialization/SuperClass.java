package com.example.object.oop.initialization;

/**
 * 父类成员的初始化机制
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:02
 */

public class SuperClass {

    /**
     * 无参构造方法
     */
    public SuperClass(){
        System.out.println("7.父类执行无参的构造方法");
        //查看显示初始化成员变量赋值结果
        //System.out.println("staticVariable = " + SuperClass.staticVariable);
        //System.out.println("memberVariable = " + this.memberVariable);
    }

    //静态代码块
    static {
        System.out.println("1.父类执行静态代码块");
        //查看静态变量的默认值
        //System.out.println("staticVariable = " + SuperClass.staticVariable);
    }


    /**
     * 显示初始化成员变量赋值
     * 默认初始化
     */
    private String memberVariable = initMemberVariable();

    //构造代码块
    {
        System.out.println("6.父类执行构造代码块");
        //查看成员变量的默认值
        //System.out.println("memberVariable = " + this.memberVariable);
    }


    private String initMemberVariable() {
        System.out.println("5.父类执行显示初始化成员变量赋值");

        return "我是一个成员变量";
    }

    /**
     * 显示初始化静态成员变量赋值
     */
    private static String staticVariable = initStaticVariable();

    private static String initStaticVariable() {
        System.out.println("2.父类执行显示初始化静态成员变量赋值");

        return "我是一个静态变量";
    }


    static class InnerClass{
        static {
            System.out.println("6.执行父类的静态内部类的静态代码块");
        }
    }
}
