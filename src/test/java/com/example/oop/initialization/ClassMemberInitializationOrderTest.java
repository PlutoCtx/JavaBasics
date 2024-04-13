package com.example.oop.initialization;

import com.example.object.oop.initialization.SubClass;

/**
 * 类的成员初始化顺序的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:10
 */

public class ClassMemberInitializationOrderTest {

    public static void main(String[] args) {
        new SubClass();

        SubClass.InnerClass innerClass = new SubClass.InnerClass();

    }
}
