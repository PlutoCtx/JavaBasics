package com.example.object.oop.interfaces.service;

/**
 * 比较器
 *
 * @author MaxBrooks chentingxian195467.163.com
 * since jdk17
 * @version 2022/8/12 16:11
 */

public interface Comparator {

    /**
     * 两个对象的比较
     * @param source
     * @param target
     * @return
     *
     * 如果source 大于target 返回1
     * 如果source 小于target 返回-1
     * 如果source 等于target 返回0
     *
     */
    int compare(Cellphone source,Cellphone target);
}
