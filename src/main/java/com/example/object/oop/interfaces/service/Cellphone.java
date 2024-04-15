package com.example.object.oop.interfaces.service;

import com.google.common.collect.Table;

import java.util.Objects;

/**
 * 手机类
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:10
 */

public class Cellphone {

    /**
     * 手机型号
     */
    private String model;

    /**
     * 手机品牌
     */
    private String brand;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 颜色
     */
    private String color;

    /**
     * 手机重量
     */
    private Integer weight;


    public Cellphone(String model, Integer price, Integer weight) {
        this.model = model;
        this.price = price;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        if (price < 0 || price > 100_0000) {
            throw new RuntimeException("价格异常");
        }
        System.out.println("价格设置成功");
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /*******************构造器*******************/
    public Cellphone() {
    }

    public Cellphone(String model, String brand, Integer price, String color, Integer weight) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.weight = weight;
    }


    /**
     * 带参构造器
     * @param model
     */
    public Cellphone(String model){
        this.model = model;
    }


    /**
     *
     * @param model
     * @param price
     */
    public Cellphone(String model,Integer price){
        this(model);        //this.model = model;
        this.price = price;
    }




    @Override
    public String toString() {
        return "手机信息{" +
                "型号='" + model + '\'' +
                ", price=" + price +
                '}';
    }





    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Cellphone cellphone = (Cellphone) o;
        return model.equals(cellphone.model) && price.equals(cellphone.price) && weight.equals(cellphone.weight);
    }


    @Override
    public int hashCode(){
        return Objects.hash(model,price,weight);
    }

//    @Override
//    public int compareTo(Cellphone cellphone){
//        //需求 按价格降序排序
//        //降序 后减前
//        return cellphone.getPrice() - this.getPrice();
//    }




}

