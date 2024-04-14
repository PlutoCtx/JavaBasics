package com.example.jdk.feature.java5;

import com.example.object.oop.interfaces.service.Cellphone;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JavaBasics
 * 泛型的使用
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/14 19:11
 * @since JDK17
 */

public class GenericTest {

    /**
     * 无泛型的问题
     */
    @Test
    public void testListWithoutGeneric() {

        List list = new ArrayList();
        list.add("Java");
        list.add(110);
        list.add(3.14);

        for (Object object : list) {
            // 如果不做类型判断，可能会发生类型转换异常
            // java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
            String string = (String) object;
            System.out.println(object);
            System.out.println("字符串长度" + string.length());
        }
    }



    /**
     * 泛型集合
     */
    @Test
    public void testListWithGeneric() {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("MySQL");
        list.add("Linux");
        // 编译期的类型检查
        // list.add(100);
    }

    /**
     * 泛型类的使用
     */
    @Test
    public void testGenericClassUsed() {

        // 在创建泛型类的对象时必须指定泛型的具体类型，例如String
        FastArrayList<String> fastArrayList = new FastArrayList<>();

        fastArrayList.addElement("Java");
        fastArrayList.addElement("MySQL");
        fastArrayList.addElement("Linux");

        System.out.println(fastArrayList);
    }


    /**
     * 泛型接口的使用
     */
    @Test
    public void testGenericInterfaceUsed() {
        // 使用泛型接口实现类对象，必须指定泛型接口的具体类型
        FastList<String> fastList = new FastArrayList<>();
        fastList.add("Java");
        fastList.add("MySQL");
        fastList.add("Linux");

        System.out.println(fastList);
    }


    /**
     * 将数组拷贝到List集合中
     * @param array 数组 数组的元素是T，T是泛型类型，在定义时不确定的类型，在调用方法时替换成具体的类型
     * @return
     * @param <T>
     */
    public <T> List<T> copyFromArrayToList(T[] array) {
        List<T> data = new ArrayList<>();
        for (T element : array) {
            data.add(element);
        }
        return data;
    }


    @Test
    public void testCopyFromArrayToList() {

        String[] strArray = {"Java", "Go", "Rust"};
        List<String> languageList = copyFromArrayToList(strArray);
        System.out.println("将字符串数组的内容拷贝到List中的结果是" + languageList);

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> integerList = copyFromArrayToList(intArray);
        System.out.println("将整数组的内容拷贝到List中的结果是" + integerList);

    }



    public void printStringList(List<String> languageList){
        System.out.println("遍历集合，集合的元素是字符串");
        for(String language : languageList) {
            System.out.println(language);
        }
    }

    public void printIntList(List<Integer> intList){
        System.out.println("遍历集合，集合的元素是整数");
        for(Integer value : intList) {
            System.out.println(value);
        }
    }

    /**
     * 通用的打印List，List集合的元素可以是任何类型，这个就是通配符的作用
     * @param elements
     */
    public void printData(List<?> elements){
        System.out.println("遍历集合，集合的元素是Object");

//        List<?> 不能添加数据，此时的?当做Object来处理
//        elements.add("hahahah");

        for(Object element : elements) {
            System.out.println(element);
        }
    }



    /**
     * 泛型通配符
     */
    @Test
    public void testGenericWildcardCharacter() {
        String[] strArray = {"Java", "Go", "Rust"};
        List<String> languageList = copyFromArrayToList(strArray);
//        printStringList(languageList);
        printData(languageList);


        Integer[] intArray={1,2,3,4,5,6,7,8};
        List<Integer> integerList = copyFromArrayToList(intArray);
//        printIntList(integerList);
        printData(integerList);

    }


    /**
     * 显示手机信息
     * 使用泛型通配符的上限
     * @param cellphoneList
     * @param <T>   只能是Cellphone以及它的子类
     */
    public <T extends Cellphone> void showCellphoneInfo(List<T> cellphoneList) {
        System.out.println("显示手机的信息");

        for (T cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
    }

    /**
     * 使用泛型通配符上限的泛型方法
     */
    @Test
    public void testGenericWildcardCharacterUp() {
        List<Cellphone> cellphoneList = new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone13"));
        cellphoneList.add(new Cellphone("华为P50 pro plus"));
//        cellphoneList.add("Java");
        showCellphoneInfo(cellphoneList);
    }

    /**
     * 打印输出list集合元素内容，集合的元素必须是Integer以及Integer父类Number
     * 通配符下限的使用
     * @param list
     */
    public void printList(List<? super Integer> list) {

        for (Object object : list) {
            System.out.println(object);
        }
    }

    /**
     * 泛型通配符下限的使用
     */
    @Test
    public void testGenericWildcardCharacterDown() {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println("********** 集合的元素是Integer ************");
        printList(intList);

        List<Number> numberList = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800));
        System.out.println("********** 集合的元素是Integer的父类Number ************");
        printList(numberList);


    }








}
