package com.example.object.oop.initialization;

/**
 * 子类成员的初始化机制
 *
 * 1 2的优先级相同 执行顺序取决于谁先定义
 * 3 4的优先级相同 执行顺序取决于谁先定义
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:02
 */

public class SubClass extends SuperClass{


    /**
     * 无参构造方法
     */
    public SubClass(){
        System.out.println("10.子类执行无参的构造方法");
        //查看显示初始化成员变量赋值结果
        //System.out.println("staticVariable = " + SubClass.staticVariable);
        //System.out.println("memberVariable = " + this.memberVariable);

    }

    //构造代码块
    {
        System.out.println("8.子类执行构造代码块");
        //查看成员变量的默认值
        //System.out.println("memberVariable = " + this.memberVariable);
    }

    //静态代码块
    static {
        System.out.println("3.子类执行静态代码块");
        //查看静态变量的默认值
        //System.out.println("staticVariable = " + SubClass.staticVariable);
    }


    /**
     * 显示初始化成员变量赋值
     * 默认初始化
     */
    private String memberVariable = initMemberVariable();

    private String initMemberVariable() {
        System.out.println("9.子类执行显示初始化成员变量赋值");

        return "我是一个成员变量";
    }

    /**
     * 显示初始化静态成员变量赋值
     */
    private static String staticVariable = initStaticVariable();

    private static String initStaticVariable() {
        System.out.println("4.子类执行显示初始化静态成员变量赋值");

        return "我是一个静态变量";
    }



    public static class InnerClass{
        static {
            System.out.println("11.执行子类的静态内部类的静态代码块");

        }


    }





}
