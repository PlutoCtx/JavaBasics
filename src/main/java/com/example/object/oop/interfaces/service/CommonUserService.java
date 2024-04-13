package com.example.object.oop.interfaces.service;

import com.example.object.oop.interfaces.service.impl.SecurityServiceImpl;
import com.example.object.oop.interfaces.service.impl.ValidationServiceImpl;
import com.example.object.oop.interfaces.service.services.SecurityService;
import com.example.object.oop.interfaces.service.services.ValidationService;

/**
 * 通用的用户服务
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:40
 */

public abstract class CommonUserService {
    /**
     * 将有一个网络安全服务
     */
    protected final SecurityService securityService = new SecurityServiceImpl();

    /**
     * 组合校验服务
     */
    protected final ValidationService validationService = new ValidationServiceImpl();


    public SecurityService getSecurityService(){
        return securityService;
    }

    public ValidationService getValidationService(){
        return validationService;
    }

}

