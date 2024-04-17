package com.example.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

/**
 * Java8 时间API-LocalTime常用方法使用的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:42
 */

public class LocalTimeTest {

    LocalTime now = null;

    @BeforeClass
    public void initLocalTime(){
        now = LocalTime.now();
        System.out.println("当前时间信息：" + now);
    }


    /**
     * 两种创建LocalTime对象的方法
     */
    @Test
    public void testLocalTimeInstance(){
        LocalTime now = LocalTime.now();
        System.out.println("当前时间信息：" + now);

        LocalTime customTime = LocalTime.of(17, 8, 45);
        System.out.println("自定义时间：" + customTime);
    }


    @Test
    public void testLocalTimeGetTimeInstance(){
        System.out.println("当前时间信息：" + now.getHour() + "时" + now.getMinute() + "分" + now.getSecond() + "秒");
    }

    @Test
    public void testLocalTimeUpdateTime(){
        LocalTime withHour = now.withHour(1);
        System.out.println("修改了小时之后的时间信息：" + withHour);

        LocalTime withMinute = now.withMinute(30);
        System.out.println("修改了分钟之后的时间信息：" + withMinute);

        LocalTime withSecond = now.withSecond(15);
        System.out.println("修改了秒之后的时间信息：" + withSecond);
    }


    @Test
    public void testLocalTimeIsBeforeIsAfter(){
        LocalTime withHour = now.withHour(1);
        System.out.println("修改了小时之后的时间信息：" + withHour);

        LocalTime withMinute = now.withMinute(30);
        System.out.println("修改了分钟之后的时间信息：" + withMinute);

        System.out.println("当前时间是否在修改了的时间之前：" + now.isBefore(withHour));
    }


    @Test
    public void testLocalTimePlusMinus(){
        System.out.println("当前时间加1小时：" + now.plusHours(1));
        System.out.println("当前时间减1小时：" + now.minusHours(1));

        System.out.println("当前时间加10分钟：" + now.plusMinutes(10));
        System.out.println("当前时间减10分钟：" + now.minusMinutes(10));

        System.out.println("当前时间加15秒：" + now.plusSeconds(15));
        System.out.println("当前时间减15秒：" + now.minusSeconds(15));
    }
}
