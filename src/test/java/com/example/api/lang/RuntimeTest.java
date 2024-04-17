package com.example.api.lang;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * RunTime常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:30
 */

public class RuntimeTest {

    Runtime runtime = Runtime.getRuntime();

    /**
     * 通过RunTime获取java运行程序时的硬件信息
     */
    @Test
    public void testRuntimeHardWare(){
        //对应Windows任务管理器CPU的逻辑处理器的数量
        System.out.println("Java 虚拟机可用的处理器数量" + runtime.availableProcessors());
        System.out.println("Java运行时环境 Java虚拟机中可用内存量" + runtime.freeMemory() + "字节");
        System.out.println("Java运行时环境 Java虚拟机将尝试使用的最大内存量" + runtime.maxMemory() + "字节");
        System.out.println("Java运行时环境 Java虚拟机中的内存总量" + runtime.totalMemory() + "字节");
    }

    @Test
    public void testRuntimeExec(){
        try {
            //runtime.exec("notepad.exe");    //打开笔记本
            runtime.exec("calc.exe");       //打开计算器
            runtime.exec("mspaint.exe");    //打开画图软件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
