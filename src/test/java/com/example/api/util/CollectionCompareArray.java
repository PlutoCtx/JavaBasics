package com.example.api.util;

import com.example.object.oop.interfaces.service.Cellphone;

import java.util.*;

/**
 * 集合与数组的对比
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/14 10:10
 */

public class CollectionCompareArray {

    public static void main(String[] args) {
        //数组存储基本数据类型
        int[] numbers = {1,2,3};

        //数组存储引用数据类型
        Cellphone[] cellphones = {new Cellphone("iphone12")};

        Collection container = new ArrayList();
        container.add(1);
        container.add("hahaha");
        container.add(3.145);
        container.add(true);
        container.add(new Cellphone("iphone12"));

        //双列集合 添加的都是key-value键值对形式的对象
        Map<String ,String> map = new HashMap<>();
        map.put("姓名","Max");
        map.put("年龄","19");
    }

}
