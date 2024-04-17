package com.example.oop.interfaces.service;

import com.example.object.oop.interfaces.service.Cellphone;
import com.example.object.oop.interfaces.service.Comparator;
import com.example.object.oop.interfaces.service.SortByPrice;

/**
 * 接口的案例：接口作为对象数组的形参->对象数组的排序
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 21:42
 */

public class SortTest {
    public static void main(String[] args) {
        //创建Cellphone对象数组
        Cellphone[] cellphones = {
                new Cellphone("小米11","小米",6999,"黑色",288),
                new Cellphone("三星12","三星",5999,"白的",195),
                new Cellphone("华为P40","华为",4599,"黑色",320),
                new Cellphone("联想","联想",5799,"白色",350)
        };

        //增强for循环
        System.out.println("排序之前");

        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }

        sort(cellphones,new SortByPrice());
        System.out.println("排序之后");
//        System.out.println(Arrays.toString(cellphones));
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }
    }

    public static void sort(Cellphone[] cellphones, Comparator comparator){
        for (int i = 0;i < cellphones.length - 1;i++){
            for (int j = 0;j < cellphones.length - 1 - i;j++){
                //if (cellphones[j].getPrice() > cellphones[j+1].getPrice()){
                if (comparator.compare(cellphones[j],cellphones[j+1])>0){
                    Cellphone temp = cellphones[j];
                    cellphones[j] = cellphones[j+1];
                    cellphones[j+1] = temp;
                }
            }
        }
    }
}
