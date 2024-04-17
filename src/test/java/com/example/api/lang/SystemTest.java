package com.example.api.lang;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

/**
 * System类常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:33
 */

public class SystemTest {


    @Test
    public void testCurrentTimeMillis(){
        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("开始时间：" + startTime);
        System.out.println("结束时间：" + endTime);
        long time =  endTime - startTime;
        System.out.println("耗时：" + time + "毫秒");
    }


    /**
     * 获取系统环境变量信息
     */
    @Test
    public void testSystemGetEnv(){
        Map<String, String> env = System.getenv();
        //增强for循环遍历map
        for (String name : env.keySet()){
            //name 表示变量名
            //env.get(name) 根据变量名获取变量值
            System.out.println(name + "----->" + env.get(name));
        }
    }

    /**
     * 获取系统指定的环境变量信息
     */
    @Test
    public void testSystemGetEnvByName(){
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("MAVEN_HOME"));
    }


    /**
     * 获取系统属性
     */
    @Test
    public void testSystemProperties(){
        Properties properties = System.getProperties();

        try {
            //获取系统的所有属性并存储到system_properties.txt中，文件的注释是Windows System
            properties.store(new FileOutputStream("system_properties.txt"),"Windows System");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取指定系统属性
     */
    @Test
    public void testSystemGetProperty(){
        Properties properties = System.getProperties();
        //获取当前操作系统名称
        System.out.println(System.getProperty("os.name"));
        //获取当前操作系统换行分隔符
        System.out.println(System.getProperty("line.separator"));
        //获取当前操作系统的文件编码
        System.out.println(System.getProperty("file.encoding"));
        //java版本
        System.out.println(System.getProperty("java.version"));
        //字节码版本
        System.out.println(System.getProperty("java.class.version"));
        //当前虚拟机的名称
        System.out.println(System.getProperty("java.vm.name"));
    }


    /**
     * 退出JVM
     */
    @Test
    public void testSystemExit(){
        //0 正常退出 JVM
        //非0 异常退出 JVM
        System.out.println("456");
        System.exit(0);
        System.out.println("123");
    }


    /**
     * 数组复制
     */
    @Test
    public void testSystemArrayCopy(){
        int[] src = {1,2,3,4,5,6,7,8,9};
        int[] dest = {100,200,300,400,500,600,700,800,900};

        //从原数组的2号索引开始，复制3个数到目标数组
        System.out.println("原数组的内容：" + Arrays.toString(src));
        System.arraycopy(src,2,dest,2,3);
        System.out.println("新数组的内容：" + Arrays.toString(dest));

    }
}
