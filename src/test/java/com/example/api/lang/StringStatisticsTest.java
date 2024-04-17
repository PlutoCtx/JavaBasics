package com.example.api.lang;

import java.util.Scanner;

/**
 * 字符串统计
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:31
 */

public class StringStatisticsTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一段字符串：");

        String str = input.next();

        //大写字母
        int upperCaseCount = 0;
        //小写字母
        int lowerCaseCount = 0;
        //数字
        int numberCount = 0;


        //统计字符串中大小写字母以及字符串中数字的个数
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCaseCount++;
            }else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }else if (Character.isDigit(ch)){
                numberCount++;
            }
        }


        System.out.printf("你输入的字符串中，大写字母数量是%d，小写字母数量是%d，" +
                "数字的数量是%d", upperCaseCount, lowerCaseCount, numberCount);

    }
}
