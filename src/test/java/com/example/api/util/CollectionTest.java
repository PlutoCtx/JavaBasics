package com.example.api.util;

import com.example.object.oop.interfaces.service.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口常用方法测试用例
 *
 * Collection接口常用的方法操作的都是字符串
 * 集合API常用的方法都是组合使用，针对不同的业务场景
 * 日常开发中集合通常操作的是自定义的类，例如Cellphone
 *
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/14 11:12
 */

public class CollectionTest {

    Collection<String> collection = new ArrayList<>();

    /**
     * 初始化collection,该方法会在所有的测试方法之前执行
     */
    @BeforeClass
    public void initCollection(){
        collection.add("北京");

        //System.out.println("当前集合元素：" + collection);

        //子集合
        Collection<String> subCollection = new ArrayList<>();
        subCollection.add("上海");
        subCollection.add("深圳");
        subCollection.add("南京");
        collection.addAll(subCollection);

        //System.out.println("将subCollection的全部元素添加到collection集合后 当前集合元素：" + collection);
    }









    /**
     * 集合添加元素
     *
     * @See java.util.Collection #add(Object)
     * @See java.util.Collection #addAll(Collection)
     */
    @Test
    public void testCollectionAddAll(){
        //创建一个集合对象，规定了集合存储的元素必须是字符串
        Collection<String> collection = new ArrayList<>();

        //往集合中添加一个人元素，元素的类型是字符串，元素的值是北京
        collection.add("北京");
        collection.add("北京");
        System.out.println("当前集合元素：" + collection);

        //子集合
        Collection<String> subCollection = new ArrayList<>();
        subCollection.add("上海");
        subCollection.add("深圳");
        subCollection.add("南京");
        collection.addAll(subCollection);

        System.out.println("将subCollection的全部元素添加到collection集合后 当前集合元素：" + collection);
    }


    /**
     * 判断是否包含指定的元素（单个元素、集合）
     *
     * @See java.util.Collection #contains(Object)
     * @See java.util.Collection #containsAll(Collection)
     */
    @Test
    public void testCollectionContainsAll(){
        boolean isContains = collection.contains("北京");
        System.out.println("collection集合中是否包含北京" + isContains);

        Collection<String> sameCollection = new ArrayList<>();
        sameCollection.add("北京");
        sameCollection.add("上海");
        sameCollection.add("深圳");
        sameCollection.add("南京");

        boolean isSame = collection.containsAll(sameCollection);
        System.out.println("collection集合中是否包含sameCollection集合的全部元素" + isSame);

        //equals()方法哪里来的
        System.out.println(collection.equals(sameCollection));
    }

    /**
     * 删除集合中指定的元素
     *
     * @See java.util.Collection #remove(Object)
     * @See java.util.Collection #removeAll(Collection)
     */
    @Test
    public void testCollectionRemoveAll(){
        collection.remove("上海");
        System.out.println("删除上海之后的集合：" + collection);

        Collection<String> subCollection = new ArrayList<>();
        subCollection.add("南京");
        subCollection.add("北京");

        collection.removeAll(subCollection);
        System.out.println("删除北京和南京后的集合元素：" + collection);

    }

    /**
     * 删除集合中所有的元素 慎用
     *
     * @See java.util.Collection #clear()
     */
    @Test
    public void testCollectionClear(){
        collection.clear();
        System.out.println("清空集合的所有元素：" + collection);

    }

    /**
     * 集合属性获取
     * @See Collection #size()
     * @See Collection #isEmpty()
     */
    @Test
    public void testCollectionSizeIsEmpty(){
        System.out.println("没有清空集合之前，当前collection集合的元素个数：" + collection.size());
        System.out.println("没有清空集合之前，当前collection集合是否为空：" + collection.isEmpty());
        collection.clear();
        System.out.println("清空集合之前，当前collection集合的元素个数：" + collection.size());
        System.out.println("清空集合之前，当前collection集合是否为空：" + collection.isEmpty());

    }


    /**
     * 集合和数组的相互转换
     */
    @Test
    public void testCollectionToArray(){

        //Collection集合转数组
        System.out.println("Collection集合转数组");
        Object[] cities = collection.toArray();
        for (Object city : cities) {
            System.out.println(city);
        }

        //数组转List
        List<String> anotherCities = Arrays.asList("苏州","重庆","长沙");

        System.out.println("数组转List");
        for (String anotherCity : anotherCities) {
            System.out.println(anotherCity);
        }
    }



    @Test
    public void testCollectionUsage(){
        List<Cellphone> cellphoneList = new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone12"));
        cellphoneList.add(new Cellphone("小米"));
        cellphoneList.add(new Cellphone("华为"));

        System.out.println(cellphoneList);

        /*
            常用的方法都是组合使用，针对不同的业务场景
         */




    }


}
