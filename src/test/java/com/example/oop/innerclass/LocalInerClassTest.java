package com.example.oop.innerclass;

/**
 * 局部内部类测试用例
 *
 * 局部内部类中使用了方法的局部变量，那么这个局部变量默认使用final修饰
 * 局部内部类不能定义静态成员
 * 局部内部类只能使用默认访问权限。只是作为方法的局部变量存在
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:12
 */

public class LocalInerClassTest {

    public static void main(String[] args) {

        int number = 10;

        class InnerClass{
            private String name;
            InnerClass(String name){
                this.name = name;
            }

            public void showLocalMemberInfo(){
                System.out.println(this.name);
                System.out.println("main(方法的局部变量 number = " + number);

            }
        }

        InnerClass innerClass = new InnerClass("局部内部类");
        innerClass.showLocalMemberInfo();








    }


}
