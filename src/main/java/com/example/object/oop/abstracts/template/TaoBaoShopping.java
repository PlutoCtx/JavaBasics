package com.example.object.oop.abstracts.template;

/**
 * 淘宝购物
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:59
 */

public class TaoBaoShopping extends AbstractShoppingTemplate{
    @Override
    protected void register() {
        System.out.println("欢迎注册淘宝");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("欢迎登录淘宝");
    }

    @Override
    protected void search() {
        System.out.println("淘宝用户搜索淘宝商品");
    }

    @Override
    protected void addShoppingCart() {
        System.out.println("淘宝用户将商品添加到购物车");
    }

    @Override
    protected void pay() {
        System.out.println("淘宝使用支付宝支付");
    }

    @Override
    protected void commitOrder() {
        System.out.println("淘宝用户提交订单");
    }
}

