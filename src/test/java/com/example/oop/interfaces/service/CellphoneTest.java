package com.example.oop.interfaces.service;

import com.example.object.oop.interfaces.service.Cellphone;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 21:33
 */

public class CellphoneTest {
    Cellphone cellphone = new Cellphone("model", "brand", Integer.valueOf(0), "color", Integer.valueOf(0));

    @Test
    public void testToString() {
        String result = cellphone.toString();
        // TODO PlutoCtx-2024/4/14: test failed
        Assert.assertEquals(result, "replaceMeWithExpectedResult");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
