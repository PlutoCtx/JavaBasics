package com.example.oop.enums;

import com.example.object.oop.enums.Season;

/**
 * 枚举的使用测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:48
 */

public class EnumTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println();
        System.out.println(spring);

        spring = Season.getSeasonByDescription("春天");
        System.out.println(spring.getDescription());

    }
}
