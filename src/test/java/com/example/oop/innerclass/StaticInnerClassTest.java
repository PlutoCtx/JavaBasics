package com.example.oop.innerclass;

import com.example.object.oop.innerclass.StaticInnerClass;

/**
 * 静态内部类测试
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:13
 */

public class StaticInnerClassTest {
    public static void main(String[] args) {
        //创建静态内部类的对象
        StaticInnerClass.InnerClass innerClass = new StaticInnerClass.InnerClass();
        //StaticInnerClass staticInnerClass = new StaticInnerClass();
        //StaticInnerClass.InnerClass innerClass = StaticInnerClass.class;


        //调用静态内部类方法
        innerClass.showStaticMemberInfo(30);


    }
}
