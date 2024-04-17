package com.example.oop.innerclass;

import com.example.object.oop.innerclass.MemberInnerClass;

/**
 * 成员内部类测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:12
 */

public class MemberInnerClassTest {
    public static void main(String[] args) {
        //创建外部类对象
        MemberInnerClass memberInnerClass = new MemberInnerClass("外部类");
        //通过外部类对象创建内部类对象
        MemberInnerClass.Innerclass innerclass = memberInnerClass.new Innerclass("内部类");
        innerclass.showMemberInfo("形参");
    }
}
