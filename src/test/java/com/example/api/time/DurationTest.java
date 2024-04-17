package com.example.api.time;

import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalTime;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:40
 */

public class DurationTest {

    @Test
    public void testDurationBetween(){
        LocalTime startTime = LocalTime.of(5, 30, 25);
        LocalTime endTime = LocalTime.of(6, 25, 15);

        Duration duration = Duration.between(startTime, endTime);
//        System.out.println(duration);
        System.out.println("两个渡口相距多少" + duration.getSeconds() + "秒");
    }
}
