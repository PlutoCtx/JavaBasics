package com.example.object.oop.interfaces.service;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:15
 */

public class SortByPrice implements Comparator{
    @Override
    public int compare(Cellphone source, Cellphone target) {
        return source.getPrice() - target.getPrice();
    }
}
