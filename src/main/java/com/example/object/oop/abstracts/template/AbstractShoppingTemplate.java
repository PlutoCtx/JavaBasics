package com.example.object.oop.abstracts.template;

/**
 * 网购模板
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:57
 */

public abstract class AbstractShoppingTemplate {
    /**
     * 买东西
     */
    public void shopping(){
        register();
        login();
        search();
        addShoppingCart();
        pay();
        commitOrder();

    }


    /**
     * 注册
     */
    protected abstract void register();


    /**
     * 实名认证
     * 通用功能
     */
    protected void realName(){
        System.out.println("你的实名认证以及通过");
    }


    /**
     * 登录
     */
    protected abstract void login();


    /**
     * 搜索商品
     */
    protected abstract void search();

    /**
     * 添加购物车
     */
    protected abstract void addShoppingCart();

    /**
     * 支付
     */
    protected abstract void pay();

    /**
     * 提交
     */
    protected abstract void commitOrder();

}
