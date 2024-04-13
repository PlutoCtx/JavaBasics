package com.example.api.lang;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * 获取进程相关测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:29
 */

public class ProcessHandleTest {


    @Test
    public void testGetProcessInfo(){
        Runtime runtime = Runtime.getRuntime();
        String command = "mspaint.exe";


        try {
            Process process = runtime.exec(command);
            ProcessHandle processHandle = process.toHandle();
            //如果要kill某个进程，根据pid去kill
            System.out.println(command + "的进程PID是" +processHandle.pid());
            System.out.println(command + "的进程状态是" +processHandle.isAlive());

            ProcessHandle.Info info = processHandle.info();
            System.out.println(command + "的进程的命令是" + info.command().get());
            //开始时间比北京时间晚8个小时
            System.out.println(command + "的进程开始时间是" + info.startInstant().get());

            System.out.println(command + "的进程总运行时间是" + info.totalCpuDuration().get());





        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
