package com.example.object.oop.abstracts.template;

/**
 * 京东购物
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:58
 */

public class JDShopping extends AbstractShoppingTemplate{
    @Override
    protected void register() {
        System.out.println("欢迎注册京东");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("欢迎登录京东");
    }

    @Override
    protected void search() {
        System.out.println("京东用户搜索京东商品");
    }

    @Override
    protected void addShoppingCart() {
        System.out.println("京东用户将商品添加到购物车");
    }

    @Override
    protected void pay() {
        System.out.println("京东使用白条支付");
    }

    @Override
    protected void commitOrder() {
        System.out.println("京东用户提交订单");
    }
}
