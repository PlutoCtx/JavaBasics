package com.example.api.util;

import java.util.*;

/**
 * 从控制台输入字符串，统计各个字符出现的次数
 *
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/12/26 14:24
 * @since JDK17
 */

public class MapStatisticsCharCount {

    public static void main(String[] args) {
        System.out.println("请输入一段字符串：");

        Scanner input = new Scanner(System.in);
        // 将字符串保存到text中
        String text = input.nextLine();
        // 将字符串转换为字符数组
        char[] chars = text.toCharArray();
        // 遍历字符串数组，统计每个字符的个数
        //LinkedHashMap  TreeMap  HashMap
        Map<Character, Integer> map = new LinkedHashMap<>();

        // 遍历数组，统计每个字符的个数
        for (char ch : chars) {
            // 用户输入了重复的字符
            if (map.containsKey(ch)){
                Integer count = map.get(ch);
                count ++;
                map.put(ch, count);
            }else {
                map.put(ch, 1);
            }
        }

        System.out.println("map的内容为：" + map);

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            Character ch = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("字符" + ch + "个数是" + count);
        }
    }

}
