package com.example.object.oop.innerclass;

/**
 * 静态内部类
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:05
 */

public class StaticInnerClass {
    static int count = 10;

    public static class InnerClass{
        static int count = 20;
        public void showStaticMemberInfo(int count){
            System.out.println("形参 count = " + count);
            System.out.println("内部类的静态成员 count = " + InnerClass.count);
            System.out.println("外部类的静态成员 count = " + StaticInnerClass.count);

        }
    }

}
