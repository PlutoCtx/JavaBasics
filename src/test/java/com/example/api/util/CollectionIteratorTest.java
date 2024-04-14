package com.example.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合的遍历
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/14 16:31
 */

public class CollectionIteratorTest {

    Collection<String> collection;

    @BeforeClass
    public void initCollection(){
        collection = new ArrayList<>();
        collection.add("北京");
        collection.add("上海");
        collection.add("广州");
        collection.add("深圳");
        System.out.println("当前collection集合的元素：" + collection);
        System.out.println("\n");

    }




    /**
     * 使用Iterator遍历Collection集合
     * 当使用Iterator对象的next()方法获取集合中的元素，如果已经获取到最后一个元素（也就是
     * while循环执行完成），还要继续调用next()方法，此时就会产生NoSuchElementException异常，
     * 因为此时迭代器已经迭代到集合的最后一个元素
     *
     */
    @Test
    public void testCollectionIterator(){

        System.out.println("使用Iterator遍历Collection集合");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }

        //String city = iterator.next();
        //System.out.println(city);
    }


    /**
     * 使用Iterator遍历Collection集合
     * 当使用NoSuchElementException
     *
     */
    @Test
    public void testCollectionIteratorConcurrentModificationException(){

        System.out.println("使用Iterator遍历Collection集合");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            //在迭代器迭代集合的元素时，不能使用Collection接口的方法来修改集合的元素
            //例如删除元素、添加元素，否则会引发ConcurrentModificationException并发异常
            //如果非要删除，则须使用iterator的remove方法
            //如果非要添加，可以使用ListIterator
            //collection.remove("深圳");
            //System.out.println(city);
            if (city.equals("深圳")){
                iterator.remove();
            }else {
                //String city = iterator.next();
                System.out.println(city);
            }
        }
        System.out.println("当前集合元素的内容：" + collection);

    }


    /**
     * 使用Iterator遍历Collection集合是产生NoSuchElementException
     */
    @Test
    public void testCollectionIteratorNoSuchElementException(){

        System.out.println("使用Iterator遍历Collection集合");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }

        //此处会引发NoSuchElementException异常
//        String city = iterator.next();
//        System.out.println(city);

        //再创建一个Iterator对象，重新开始迭代，这样就解决了NoSuchElementException
        iterator = collection.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }
    }




    /**
     * 使用增强for循环遍历集合和数组
     * 增强for循环底层是Iterator,所以Iterator有的问题它都有
     */
    @Test
    public void testForeachCollectionArray(){

        System.out.println("使用增强for循环遍历集合");
        for (String city : collection) {
            //collection.remove("数组");
            System.out.println(city);
        }


        System.out.println("使用增强for循环遍历数组");
        Object[] objects = collection.toArray();
        for (Object city : objects) {
            //collection.remove("数组");
            System.out.println(city);
        }




    }





}
