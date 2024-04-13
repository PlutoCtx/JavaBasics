package com.example.object.oop.innerclass;

/**
 * 成员内部类
 *
 *  内部类不能拥有静态成员（变量或方法）
 *
 *  内部类 懒加载 只有使用的时候才会显示
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:04
 */

public class MemberInnerClass {
    private String name;

    public MemberInnerClass(String name){
        this.name = name;
    }

    public class Innerclass{
        private String name;

        public Innerclass(String name){
            this.name = name;
        }

        /**
         * 查看成员变量
         * @param name
         */
        public void showMemberInfo(String name){
            System.out.println("形参 name = " + name);
            System.out.println("内部类成员变量 name = " + this.name);
            //访问外部类的私有成员
            System.out.println("外部类成员变量 name = " + MemberInnerClass.this.name);

        }
    }



}
