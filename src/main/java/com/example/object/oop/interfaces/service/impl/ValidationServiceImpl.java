package com.example.object.oop.interfaces.service.impl;

import com.example.object.oop.interfaces.service.services.ValidationService;

/**
 * 校验服务实现
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:38
 */

public class ValidationServiceImpl implements ValidationService {
    @Override
    public boolean validation(String username) {
        if ("max".equals(username)){
            return true;
        }
        return false;
    }
}
