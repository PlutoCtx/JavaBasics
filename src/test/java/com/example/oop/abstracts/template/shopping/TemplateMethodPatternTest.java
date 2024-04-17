package com.example.oop.abstracts.template.shopping;

import com.example.object.oop.abstracts.template.JDShopping;
import com.example.object.oop.abstracts.template.TaoBaoShopping;

/**
 * 模板方法测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:06
 */

public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        TaoBaoShopping taoBaoShopping = new TaoBaoShopping();
        taoBaoShopping.shopping();
        TaoBaoShopping taoBaoShopping1 = new TaoBaoShopping();
        taoBaoShopping1.shopping();

        JDShopping jdShopping = new JDShopping();
        jdShopping.shopping();
    }
}
