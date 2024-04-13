package com.example.api.util;

import com.example.object.oop.interfaces.service.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Map集合常用方法
 *
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/12/26 11:57
 * @since JDK17
 */

public class MapTest {
    Map<String ,String> map;

    @BeforeClass
    public void initLinkedHashMap(){
        map = new LinkedHashMap<>();    // 有序
        map.put("中国","北京");
        map.put("韩国","首尔");
        map.put("日本","东京");
        map.put("新加坡","新加坡");
        System.out.println("初始化map集合的元素内容：" + map);

    }


    /**
     * 往map集合添加元素
     */
    @Test
    public void testMapPut(){
        // Map<String, String> map = new HashMap<>(); 无序
        Map<String, String> map = new LinkedHashMap<>();    // 有序
        map.put("中国","北京");
        map.put("韩国","首尔");
        map.put("日本","东京");
        map.put("新加坡","新加坡");
        System.out.println("当前map集合的元素内容：" + map);

        Map<String, String > subMap = new LinkedHashMap<>();
        subMap.put("法国","巴黎");
        subMap.put("英国","伦敦");
        subMap.put("德国","柏林");

        //将subMap集合添加到map集合
        map.putAll(subMap);
        System.out.println("将subMap集合添加到map集合之后的map集合：" + map);
    }


    /**
     * 删除map集合的元素
     */
    @Test
    public void testMapRemove(){
        String value = map.remove("日本");
        System.out.println("删除日本之后map集合的内容" + map);
        System.out.println("删除日本之后返回的值" + value);

    }


    @Test
    public void testMapReplace(){
        map.replace("日本","大阪");
        System.out.println("修改map中日本的值之后的集合元素内容：" + map);

        map.replace("日本","大阪","名古屋");
        System.out.println("修改map中日本的值之后的集合元素内容：" + map);

    }


    /**
     * 集合中是否包含指定的key或value
     */
    @Test
    public void testMapContainsKeyContainsValue(){
        boolean isContainsChina = map.containsKey("中国");
        System.out.println("map集合中是否包含中国：" + isContainsChina);

        boolean isContainsBeijing = map.containsValue("北京");
        System.out.println("map集合中是否包含北京：" + isContainsBeijing);
    }


    /**
     * 分别获取Map集合的所有key和value
     */
    @Test
    public void testMapSetValues(){
        Set<String> allCountries = map.keySet();
        System.out.println("map集合所有的key是：" + allCountries);

        Collection<String> values = map.values();
        System.out.println("map集合所有的value是：" + values);
    }

    /**
     * 获取Map集合的所有键值对对象
     */
    @Test
    public void testMapEntrySet(){
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //遍历Set
        for (Map.Entry<String, String> entry : entrySet) {
            String country = entry.getKey();
            String capital = entry.getValue();
            //获取键值对对象的键值拼接后输出
            System.out.println("国家：" + country + "      首都：" + capital);
        }
    }


    /**
     * Map遍历的方式
     */
    @Test
    public void testMapTraversal(){
        System.out.println("***************************方式1：根据键找值*******************");

        Set<String> allKeys = map.keySet();
        for (String country : allKeys) {
            String capital = map.get(country);
            System.out.println("国家：" + country + "    首都：" + capital);
        }

        System.out.println("***************************方式2：根据键值对对对象遍历map*******************");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            String country = entry.getKey();
            String capital = entry.getValue();
            //获取键值对对象的键值拼接后输出
            System.out.println("国家：" + country + "      首都：" + capital);
        }



    }


    /**
     * 1. 键唯一 有哈希表保证唯一
     * 2. 键值对存取无序
     */
    @Test
    public void testHashMapFeature(){
        Map<Cellphone, String> map = new HashMap<>();
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        map.put(new Cellphone("华为p40", 11999, 228),"华为");
        map.put(new Cellphone("iphone14", 12999, 238),"苹果");
        map.put(new Cellphone("vivo10", 10099, 218),"vivo");
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        System.out.println("当前map集合的元素个数为：" + map.size());

        System.out.println("*********************************当前map集合的元素内容为**************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息：" + cellphone + "手机厂商名称：" + name);
        }
    }





    /**
     * 1. 键唯一 有哈希表保证唯一
     * 2. 键值对存取有序
     */
    @Test
    public void testLinkedHashMapFeature(){
        Map<Cellphone, String> map = new LinkedHashMap<>();
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        map.put(new Cellphone("华为p40", 11999, 228),"华为");
        map.put(new Cellphone("iphone14", 12999, 238),"苹果");
        map.put(new Cellphone("vivo10", 10099, 218),"vivo");
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        System.out.println("当前map集合的元素个数为：" + map.size());

        System.out.println("*********************************当前map集合的元素内容为**************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息：" + cellphone + "手机厂商名称：" + name);
        }
    }


    /**
     * 1. 键唯一 有哈希表保证唯一
     * 2. 有序 按照元素的默认排序规则来排序，元素所属的类必须实现Comparable接口的compareTo方法
     * 来实现默认的排序规则
     */
    @Test
    public void testTreeMapFeature(){
        Map<Cellphone, String> map = new TreeMap<>();
        // TODO PlutoCtx-2024/4/14: test failed
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        map.put(new Cellphone("华为p40", 11999, 228),"华为");
        map.put(new Cellphone("iphone14", 12999, 238),"苹果");
        map.put(new Cellphone("vivo10", 10099, 218),"vivo");
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        System.out.println("当前map集合的元素个数为：" + map.size());

        System.out.println("*********************************当前map集合的元素内容为**************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息：" + cellphone + "手机厂商名称：" + name);
        }
    }


    /**
     * TreeMap自定义规则排序
     * 按价格升序排序
     */
    @Test
    public void testTreeMapCustomSort(){
        Map<Cellphone, String> map = new TreeMap<>(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone1.getPrice() - cellphone2.getPrice();
            }
        });
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        map.put(new Cellphone("华为p40", 11999, 228),"华为");
        map.put(new Cellphone("iphone14", 12999, 238),"苹果");
        map.put(new Cellphone("vivo10", 10099, 218),"vivo");
        map.put(new Cellphone("小米12", 10999, 218),"小米");
        System.out.println("当前map集合的元素个数为：" + map.size());

        System.out.println("*********************************当前map集合的元素按价格升序排序内容为**************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息：" + cellphone + "手机厂商名称：" + name);
        }
    }




}
