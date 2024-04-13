package com.example.object.oop.interfaces.service.services;

/**
 * 校验服务
 *
 * @author MaxBrooks chentingxian195467.163.com
 * since jdk17
 * @version 2022/8/12 15:45
 */

public interface ValidationService {

    /**
     * 校验注册的用户名
     * @param username
     * @return
     */
    boolean validation(String username);
}

