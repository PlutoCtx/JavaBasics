package com.example.api.util;

import com.example.object.oop.interfaces.service.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * List接口常用方法的使用
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/14 20:22
 */

public class ListTest {

    List<String> cities;

    List<Cellphone> cellphoneList;

    @BeforeClass
    public void initList(){
        cities = new ArrayList<>(); // 改为LinkedList也行，且下列大多数方法都能用
        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");
        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");

        System.out.println("cities集合的元素内容是：" + cities);

        //添加三个集合中的对象，匿名对象
        cellphoneList = new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone12",13999));
        cellphoneList.add(new Cellphone("P50 pro plus",8999));
        cellphoneList.add(new Cellphone("S21 Ultra",10999));
        cellphoneList.add(new Cellphone("Vivo",6999));

        System.out.println("排序之前cellphoneList集合的元素内容");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
    }


    @Test
    public void testListFeature(){
        List<String> cities = new ArrayList<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");

        System.out.println("cities集合的元素内容：" + cities);
    }


    @Test
    public void testListAddAll(){
        List<String> cities = new ArrayList<>();
        cities.add(0,"北京");
        cities.add(1,"上海");
        cities.add(2,"广州");
        cities.add(3,"深圳");
        System.out.println("往集合中指定的索引添加元素：" + cities);

        List<String> otherCities = new ArrayList<>();
        otherCities.add("重庆");
        otherCities.add("成都");
        otherCities.add("武汉");
        otherCities.add("杭州");

        //在深圳的后面添加其他城市
        int index = cities.size();
        cities.addAll(index,otherCities);
        System.out.println("往集合中指定索引，添加指定的集合元素内容是：" + cities);
    }


    /**
     * 通过索引获取元素
     */
    @Test
    public void testListGet(){

        String city = cities.get(0);
        System.out.println("集合中0号索引的元素是：" + city);
        //通过索引获取元素时，索引必须合法（不能超出范围），否则会引发异常IndexOutOfBoundsException
        //city = cities.get(5);
        //System.out.println("集合中0号索引的元素是：" + city);
    }


    /**
     * 集合元素的查找
     * @See List #indexOf(Object)
     * @See List #lastIndexOf(Object)
     */
    @Test
    public void testListIndexOfLastIndexOf(){
        int beijingIndex = cities.indexOf("北京");
        System.out.println("北京在cities集合中第一次出现的索引：" + beijingIndex);

        String beijing = cities.get(beijingIndex);

        int shanghaiIndex = cities.lastIndexOf("上海");
        System.out.println("上海在cities集合中最后一次出现的索引：" + shanghaiIndex);

        String shanghai = cities.get(shanghaiIndex);
    }


    /**
     * 删除指定索引的元素
     * @See List #remove(int)
     */
    @Test
    public void testListRemove(){

        cities.remove(0);
        cities.remove(1);
        cities.remove(2);
        cities.remove(3);

        System.out.println("删除4个元素之后当前cities集合的元素内容是：" + cities);
    }


    /**
     * 修改指定索引的元素
     * @See List #set(int,object)
     */
    @Test
    public void testListSet(){
        // TODO PlutoCtx-2024/4/14: test failed

        cities.set(4,"天津");
        cities.set(5,"湖南");
        cities.set(6,"安徽");
        cities.set(7,"秋田");

        System.out.println("修改4个元素之后当前cities集合的元素内容是：" + cities);
    }


    /**
     * 截取指定范围的索引
     */
    @Test
    public void testListSubList(){
        /**
         * 0是开始索引
         * 4是结束索引
         * 但不包含结束索引的元素
         */
        List<String> subCities = cities.subList(0,4);
        System.out.println("截取cities结合的元素，索引从0到4，截取后subCities集合的元素内容是：" + subCities);
    }

    /****************************List集合的遍历和排序********************************/

    @Test
    public void testListIterator(){
        System.out.println("******************方式1：使用Iterator遍历List集合******************");
        Iterator<Cellphone> iterator = cellphoneList.iterator();
        while (iterator.hasNext()) {
            Cellphone cellphone = iterator.next();
            System.out.println(cellphone);
        }


        System.out.println("******************方式2：使用增强for循环遍历List集合*******************");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }


        System.out.println("******************方式3：使用for循环遍历List集合*******************");
        for (int i = 0;i < cellphoneList.size(); i++) {
            // 通过索引获取元素
            System.out.println(cellphoneList.get(i));
        }
    }


    /**
     * 按照手机的价格升序排序
     */
    @Test
    public void testListSortASC(){

        //匿名内部类
        cellphoneList.sort(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone1.getPrice() - cellphone2.getPrice();
            }
        });

        System.out.println("按照手机的价格升序排序");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
    }




    /**
     * 按照手机的价格降序排序
     */
    @Test
    public void testListSortDesc(){

        cellphoneList.sort(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone2.getPrice() - cellphone1.getPrice();
            }
        });

        System.out.println("按照手机的价格降序排序");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
    }
}
