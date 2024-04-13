package com.example.object.oop.abstracts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    //    private static Calculator cal=new Calculator();
    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }




    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }




//    @Test
//    public void testAdd() {
//        cal.add(2,2);
//        assertEquals(4,cal.getResult());
//        //fail("Not yet implemented");
//    }
//
//    @Test
//    public void testSubtract() {
//        cal.subtract(4,2);
//        assertEquals(2,cal.getResult());
//        //fail("Not yet implemented");
//    }
//
//    @Ignore
//    public void testMultiply() {
//        fail("Not yet implemented");
//    }
//
//    @Test(timeout = 2000)
//    public void testDivide() {
//        for(;;);
//    }
//
//    @Test(expected = ArithmeticException.class)
//    public void testDivideByZero(){
//        cal.divide(4,0);
//    }
    @Test
    public void getNationality() {
    }

    @Test
    public void setNationality() {
    }

    @Test
    public void eat() {
    }

    @Test
    public void sleep() {
    }
}



