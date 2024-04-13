package com.example.api.util;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数的使用
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:47
 */

public class RandomTest {

    @Test
    public void testRandomDefaultConstructor(){
        //随机生成十个数，在Int的范围内
        Random random = new Random();
        for (int i = 0;i < 10;i++){
            System.out.println(random.nextInt());
        }
    }




    /**
     * 能产生指定范围的数
     */
    @Test
    public void testRandomBound(){
        Random random = new Random();
        //random.nextInt(10);
        for (int i = 0;i < 10;i++){
            System.out.print(random.nextInt(10) + " ");
        }
    }




    /**
     * 种子数相同，则生成的序列也相同
     */
    @Test
    public void testRandomSeed(){
        Random random = new Random(88);
        for (int i = 0;i < 10;i++){
            System.out.println(random.nextInt());
        }
        /*
            -1177030515
            -441328586
            -1138069217
            2008506121
            -1829342380
            134862877
            1538110139
            1980847304
            1414505319
            -785916362
         */
    }

    /**
     * 能产生指定范围的数
     */
    @Test
    public void testThreadLocalRandom(){
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        //产生10个0.0 到100.0的数 不包括100.0
        for (int i = 0;i < 10;i++){
            System.out.println(threadLocalRandom.nextDouble(100) + " ");
        }
    }



}
