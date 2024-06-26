# Java SE 基础代码


## Map 的使用

### 1. HashMap 的使用

HashMap有如下特点：

> - 键唯一 由哈希表保证唯一
> - 键值对存取无序

```java
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
```



### 2.LinkedHashMap的使用

LinkedHashMap有如下特点：

> - 键唯一 由哈希表保证唯一
> - 键值对存取有序

```java
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
```



### 3.TreeMap的使用

TreeMap的特点如下：

> - 键唯一 有哈希表保证唯一
>
> * 有序 按照元素的默认排序规则来排序，元素所属的类必须实现Comparable接口的compareTo方法





```java
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
```

#### 自定义规则排序

```java
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
```



### 4.字符串统计案例

需求：从控制台输入字符串，统计各个字符出现的次数

分析：Map的键是用户输入的字符，Map的值是用户输入字符的个数

用户输入的字符可能会重复，因此我们需要根据键获取值，计算字符的个数时在原来的基础上自增后再更新值。如果没有重复，值（字符的个数）为1。

```java
  public static void main(String[] args) {
        System.out.println("请输入一段字符串：");

        Scanner input = new Scanner(System.in);
        // 将字符串保存到text中
        String text = input.nextLine();
        // 将字符串转换为字符数组
        char[] chars = text.toCharArray();
        // 遍历字符串数组，统计每个字符的个数
        //LinkedHashMap  TreeMap  HashMap
        Map<Character, Integer> map = new LinkedHashMap<>();

        // 遍历数组，统计每个字符的个数
        for (char ch : chars) {
            // 用户输入了重复的字符
            if (map.containsKey(ch)){
                Integer count = map.get(ch);
                count ++;
                map.put(ch, count);
            }else {
                map.put(ch, 1);
            }

        }

        System.out.println("map的内容为：" + map);

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            Character ch = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("字符" + ch + "个数是" + count);
        }
    }
```





## 集合的嵌套使用

### 1.List嵌套List

List嵌套List就是List中的元素类型又是一个List

```java
/**
 * List嵌套List
 */
@Test
public void testListNestedList(){
    List<String> asia = new ArrayList<>();
    asia.add("中国");
    asia.add("日本");
    asia.add("韩国");
    List<String> europe = new ArrayList<>();
    europe.add("英国");
    europe.add("法国");
    europe.add("德国");
    List<List<String>> world = new ArrayList<>();
    world.add(asia);
    world.add(europe);

    System.out.println("List嵌套List集合的元素遍历");
    for (List<String> allCountries : world) {
        for (String country : allCountries) {
            System.out.println(country);
        }
    }
}
```





### 2.List嵌套Map

List嵌套Map就是List中的元素类型又是一个Map

```java
    /**
     * List嵌套Map集合的元素遍历
     */
    @Test
    public void testListNestedMap(){
        Map<String,String> asiaMap = new HashMap<>();
        asiaMap.put("中国","北京");
        asiaMap.put("韩国","首尔");
        asiaMap.put("日本","东京");

        Map<String,String> europeMap = new HashMap<>();
        europeMap.put("英国","伦敦");
        europeMap.put("法国","巴黎");
        europeMap.put("德国","柏林");

        List<Map<String,String>> world = new ArrayList<>();

        world.add(asiaMap);
        world.add(europeMap);

        System.out.println("List嵌套Map集合的元素遍历");
        for (Map<String, String> map : world) {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();

            for (Map.Entry<String, String> entry : entrySet) {
                String country = entry.getKey();
                String capital = entry.getValue();
                System.out.println("国家：" + country + "    首都：" + capital);
            }

        }

    }
```



### 3.Map嵌套List

Map嵌套List表示Map的value是一个List

```java
/**
 * Map嵌套List集合的元素遍历
 */
@Test
public void testMapNestedList(){
    List<String> cityOfChina = new ArrayList<>();
    cityOfChina.add("北京");
    cityOfChina.add("上海");
    cityOfChina.add("广州");
    cityOfChina.add("深圳");

    List<String> cityOfAmerican = new ArrayList<>();
    cityOfAmerican.add("纽约");
    cityOfAmerican.add("旧金山");
    cityOfAmerican.add("波士顿");
    cityOfAmerican.add("底特律");

    Map<String,List<String>> map = new LinkedHashMap<>();
    map.put("中国",cityOfChina);
    map.put("美国",cityOfAmerican);


    Set<Map.Entry<String, List<String>>> entrySet = map.entrySet();

    System.out.println("Map嵌套List集合的元素遍历");

    for (Map.Entry<String, List<String>> entry : entrySet) {
        String country = entry.getKey();
        List<String> cities = entry.getValue();
        System.out.println("国家：" + country + "的城市有：" + cities);
    }

}
```



### 4.M ap嵌套Map

Map嵌套Map表示Map的value是一个Map

```java
/**
 * Map嵌套Map集合的元素遍历
 */
@Test
public void testMapNestedMap(){
    Map<String,String> asiaMap = new HashMap<>();
    asiaMap.put("中国","北京");
    asiaMap.put("韩国","首尔");
    asiaMap.put("日本","东京");

    Map<String,String> europeMap = new HashMap<>();
    europeMap.put("英国","伦敦");
    europeMap.put("法国","巴黎");
    europeMap.put("德国","柏林");



    Map<String,Map<String,String>> map = new LinkedHashMap<>();
    map.put("亚洲",asiaMap);
    map.put("欧洲",europeMap);

    System.out.println("Map嵌套Map集合的元素遍历");
    Set<Map.Entry<String, Map<String, String>>> world = map.entrySet();
    for (Map.Entry<String, Map<String, String>> continent : world) {
        //洲名
        String continentName = continent.getKey();

        //每个周对应的主要国家一级国家对应的首都
        Map<String, String> continentMap = continent.getValue();
        Set<Map.Entry<String, String>> entrySet = continentMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("洲名" + continentName + "\t国家：" + country + "\t首都：" + capital);
        }
        System.out.println();
    }
    
}
```



## 集合案例之斗地主

> 为什么讲斗地主的案例
>
> - 培养编程的能力，就是会使用集合API来解决相应的需求
> - 体验编程的乐趣

斗地主 一共是54张牌，三个玩家每个17张牌，然后是3张底牌

需求1：显示3个玩家以及底牌的牌；
需求2：按照牌的顺序从大到小显示显示3个玩家以及底牌的牌

### 1.造牌

1. 牌是由字符串组成，例如♣3；
2. 有一个集合存放54张牌
3. 有个集合放四个花色：红桃、黑桃、梅花、方块（♥ ♠ ♣ ♦）
4. 有个集合放其他的13张牌：2 A K Q J 10 9 8 7 6 5 4 3
5. 大小王单独放

**版本1**

```java
// 1.造牌
System.out.println("************************* 1. 造牌 *************************");

// 存放54张牌
List<String> pokerBox = new ArrayList<>();

// 存放4个花色♥ ♠ ♣ ♦
List<String> colors = new ArrayList<>();
colors.addAll(Arrays.asList("♥", "♠", "♣", "♦"));

// 存放13张牌 2 A K Q J 10 9 8 7 6 5 4 3
List<String> numbers = new ArrayList<>();
numbers.addAll(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"));

pokerBox.add("大王");
pokerBox.add("小王");
for (String number : numbers) {
    for (String color : colors) {
        String pokerCard = color + number;
        pokerBox.add(pokerCard);
    }
}

System.out.println("当前扑克牌数量为：" + pokerBox.size());
System.out.println("当前扑克牌为：" + pokerBox);
```

**版本2**

```java
// 1.造牌
System.out.println("************************* 第二版 1. 造牌 *************************");

// 存放54张牌，编号从小到大，对应牌的顺序从大到小
Map<Integer, String> pokerBox = new HashMap<>();
int id = 0;
pokerBox.put(id++, "大王");
pokerBox.put(id++, "小王");


// 存放4个花色♥ ♠ ♣ ♦
List<String> colors = new ArrayList<>();
colors.addAll(Arrays.asList("♥", "♠", "♣", "♦"));

// 存放13张牌 2 A K Q J 10 9 8 7 6 5 4 3
List<String> numbers = new ArrayList<>();
numbers.addAll(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"));

for (int i = 0; i < numbers.size(); i++) {
    for (int j = 0; j < colors.size(); j++) {
        String pokerCard = colors.get(j) + numbers.get(i);
        pokerBox.put(id++, pokerCard);
    }
}
System.out.println("造牌之后的牌：" + pokerBox);
System.out.println("造牌之后的牌数量：" + pokerBox.size());
```



### 2.洗牌

**版本1**

```java
// 2.洗牌
System.out.println("************************* 2. 洗牌 *************************");

Collections.shuffle(pokerBox);
System.out.println("洗牌之后的牌：" + pokerBox);
```

**版本2**

> 因为Collections.shuffle()只能接收List类型的参数，因此只能洗标记，也就是Map的Key，然后将Set转换为List

```java
System.out.println("************************* 第二版 2. 洗牌 *************************");
Set<Integer> idSet = pokerBox.keySet();
List<Integer> idList = new ArrayList<>(idSet);
Collections.shuffle(idList);
System.out.println("洗牌之后的牌：" + idList);
```



### 3.发牌

```java
System.out.println("************************* 3. 发牌 *************************");

// 四个集合存放玩家以及底牌的牌
List<String> player1 = new ArrayList<>();
List<String> player2 = new ArrayList<>();
List<String> player3 = new ArrayList<>();
List<String> cards = new ArrayList<>();

for (int i = 0; i < pokerBox.size(); i++) {
    String pokerCard = pokerBox.get(i);

    if (i >= 51) {
        cards.add(pokerCard);
    } else if (i % 3 == 0) {
        player1.add(pokerCard);
    } else if (i % 3 == 1) {
        player2.add(pokerCard);
    } else if (i % 3 == 2) {
        player3.add(pokerCard);
    }
}

System.out.println("玩家1的牌数量：" + player1.size());
System.out.println("玩家1的牌：" + player1);

System.out.println("玩家2的牌数量：" + player2.size());
System.out.println("玩家2的牌：" + player2);

System.out.println("玩家3的牌数量：" + player3.size());
System.out.println("玩家3的牌：" + player3);

System.out.println("底牌数量：" + cards.size());
System.out.println("底牌：" + cards);
```

**版本2：**

> 因为洗牌洗的是标记，因此发牌也要发标记，因此需要四个集合存放3个玩家以及底牌的牌的标记，然后根据牌的标记到Map中找到对应的牌存放到另外的四个集合中，这四个集合分别存放3个玩家的牌以及底牌的牌。



## 泛型编程

### 1.泛型的介绍

#### 泛型出现的背景

泛型为了集合而生的!

在没有泛型之前，集合存储的元素数据类型在编译期间是未知的，这样JDK的设计人员在设计集合API的时候只能将元素的类型定义成Object，这样集合能够存储任意数据类型，但是带来了一些问题。

##### 1.类型转换异常

```java
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
```





#### 泛型的好处

在编译的时候增加了类型检查，避免类型转换异常。如果元素的类型不一致，编译失败。

```java
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
```



#### 哪里使用泛型

- public interface Collection<E> 泛型接口，E就是泛型类型，也就是不确定是啥类型
- public class ArrayList<E> 泛型类，E就是泛型类型
- public static<T> boolean addAll(Collection<?super T> c, T...elements) 泛型方法，T是泛型类型

### 2.泛型的使用

#### 泛型类的定义和使用

泛型类定义的语法格式

```java
public class 类名<泛型类型>
```

泛型类型可以是任意的字母，但是必须有含义，而且可以定义多个泛型类型，例如Map<K, V>

自定义泛型类，而且在成员方法中使用了泛型类型

泛型类的应用场景：成员方法的参数或者是返回值不明确具体是什么类型时，可以使用泛型类的泛型类型

```java
public class FastArrayList<E> extends ArrayList<E> {
    public boolean addElement(E element) {
        return add(element);
    }
}
```

自定义泛型类的使用

```java
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
```

#### 泛型接口的定义和使用

泛型类定义的语法格式

```java
public interface InterfaceName<泛型类型>
```

泛型类型可以是任意的字母，但是必须有含义，而且可以定义多个泛型类型，例如Map<K, V>

泛型接口的定义

```java
public interface FastList<E> extends List<E> {
}
```



泛型接口的使用

实现类（泛型类）实现了泛型接口，但是实现类没有制定具体的类型

```java
public class FastArrayList<E> extends ArrayList<E> implements FastList<E> {

    public boolean addElement(E element) {
        return add(element);
    }
}
```

因此在使用实现类的时候依然要指定具体的类型

```java
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
```

#### Java7的棱形语法

> Java7的棱形语法本质就是类型推导，右边的泛型类型与左边的类型一致

在没有使用Java7的棱形语法之前

```java
FastList<String> fastList = new FastArrayList<String>();
```

使用Java7的棱形语法之后

```java
FastList<String> fastList = new FastArrayList<>();
```



#### 泛型方法的定义和使用

泛型方法的语法定义格式

```易
修饰符 <泛型类型> 返回值 方法名(形参列表) {
	方法体
}
```

方法的泛型类型通常都是给方法的形参以及方法的返回值使用。

泛型方法的定义

```java
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
```

泛型方法的调用

```java
@Test
public void testCopyFromArrayToList() {

    String[] strArray = {"Java", "Go", "Rust"};
    List<String> languageList = copyFromArrayToList(strArray);
    System.out.println("将字符串数组的内容拷贝到List中的结果是" + languageList);

    Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
    List<Integer> integerList = copyFromArrayToList(intArray);
    System.out.println("将整数组的内容拷贝到List中的结果是" + integerList);
}
```



### 3.泛型通配符

#### 泛型通配符的基本使用

> Q：为什么要有泛型通配符
>
> A：List<String>和List<Integer>不是同一种类型，他俩是平级的

```java
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
 * 泛型通配符
 */
@Test
public void testGenericWildcardCharacter() {
    String[] strArray = {"Java", "Go", "Rust"};
    List<String> languageList = copyFromArrayToList(strArray);
    printStringList(languageList);


    Integer[] intArray={1,2,3,4,5,6,7,8};
    List<Integer> integerList = copyFromArrayToList(intArray);
    printIntList(integerList);

}
```

有了通配符之后

```java
    /**
     * 通用的打印List，List集合的元素可以是任何类型，这个就是通配符的作用
     * @param elements
     */
    public void printData(List<?> elements){
        System.out.println("遍历集合，集合的元素是Object");
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
        printData(languageList);


        Integer[] intArray={1,2,3,4,5,6,7,8};
        List<Integer> integerList = copyFromArrayToList(intArray);
        printData(integerList);

    }
```



List<?>是List<String>和List<Integer>的父类

集合在使用泛型通配符的时候不能添加数据，因为只会把集合的元素当成Object处理

```java
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
```



#### 泛型通配符的上限

泛型通配符的上限<? extends T>泛型类型包含T以及T的子类

定义泛型通配符的上限的泛型方法

```java
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
```

使用泛型通配符上限的泛型方法

```java
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
```

#### 泛型通配符的下限

泛型通配符的下限<? super T>泛型类型包含T以及T的父类

```java
public static <T> boolean addAll(Collection<? super T> c, T... elements) {
	boolean result = false;
	for (T element : elements)
		result != c.add(element);
	return result;
}
```



非泛型方法使用泛型通配符的下限

```java
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
```

非泛型方法使用泛型通配符下限的调用

```java
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
```

业务开发，定义泛型类、泛型接口、泛型方法会使用较少。

但是如果开发框架，通用的组件，泛型的场景就用的比较多。



## 异常机制

### 1.异常的介绍

异常指的是程序在运行的过程中发生了不正常的情况，如果开发人员不处理，JVM会中止该程序的运行

```java
/**
 * 算术异常
 */
@Test
public void testCreateArithmeticException() {
    System.out.println("程序开始执行");
    // 0不能当做除数，此处会引发ArithmeticException异常
    System.out.println(1 / 0);
    // 由于没有处理ArithmeticException，JVM终止程序的运行，该语句不会执行
    System.out.println("程序结束执行");
}
```

### 2.异常的产生和处理流程分析

1. 程序在运行时，如果发生了异常，例如System.out.printIn(1/0); 会引发ArithmeticException也就是算术异常，该异常能被JVM识别。
2. 因为在Java语言中一切皆对象，异常也是对象。JVM会创建该异常的对象，该异常对象会包含异常类型，异常描述信息，异常的位置信息，创建完成对象之后将该异常对象抛出，thrownewArithmeticException(String str)
3. testCreateArithmeticException()方法会接收JVM抛出的ArithmeticException，但是该方法没有处理该异常，就会继续往上抛出，即还是抛给JVM，因为testCreateArithmeticException()方法是JVM调用。
4. JVM接收到ArithmeticException之后会调用printStackTrace0方法将异常的堆栈信息打印到控制台，然后终止程序的运行

### 3.异常的体系结构

java.lang.Throwable类是Java语言所有的**错误**和**异常**的父类

java.lang.error类是Java语言所有错误的父类，这里的错误指的是程序运行过程中的错误，而不是语法错误。错误是不能通过程序来修复，例如堆栈溢出，堆溢出，服务器宕机，网络不通等等。

```java
public void createStackOverFlowError() {
    System.out.println("I'm StackOverFlowError");
    createStackOverFlowError();
}

/**
 * 栈溢出错误
 */
@Test
public void testCreateStackOverFlowError() {
    createStackOverFlowError();
}
```

java.lang.Exception类是所有Java异常的父类，异常可以通过异常处理来修复，Java的异常分为两类

- 运行时异常：程序运行过程发生的异常，例如ArrayIndexOutOfBoundsException，NullPointerException，ClassCastException，它们都是RuntimeException的子类
- 编译时异常：程序在编译时发生的异常，编译时异常必须在程序运行之前处理，否则程序没法编译通过。如果该异常不是RuntimeException或者子类，那么该异常就是编译时异常。例如ParseException，IOException



![异常体系结构](README.assets/image-20240415234617855.png)



### 4.异常的产生和处理异常的产生

throw 关键字可以抛出一个异常，其语法格式就是 throw 异常类型，例如`throw new RuntimeException("异常消息”);`

throw关键字只能在方法中使用，用来抛出一个指定的异常对象，然后将异常对象传递给方法的调用者，并结束当前方法的执行。

```java
public void setPrice(Integer price) {
    if (price < 0 || price > 100_0000) {
        throw new RuntimeException("价格异常");
    }
    System.out.println("价格设置成功");
    this.price = price;
}
```

```java
@Test
public void testThrowRuntimeException(){
    Cellphone cellphone = new Cellphone();
    cellphone.setPrice(-100);
    cellphone.setModel("iphone13");
}
```

#### 异常的处理

异常处理的两种方式：声明式处理异常和**捕获处理异常**

#### 声明式处理异常

声明式处理异常通常都是使用throws关键字将异常标识出来，表示该方法不处理异常（甩锅），用来提醒方法的调用方来处理异常，如果方法的调用方也不处理，那么最终还是会到JVM,JVM会调用printStackTrace将异常的堆栈信息打印在控制台，然后终止程序。

```java
/**
 * 声明式处理异常
 */
public void throwsParseException() throws ParseException {
    throw new ParseException("解析异常", 6);
}

/**
 * 声明式处理异常
 * @throws ParseException
 */
@Test
public void testThrowsParseException() throws ParseException {
    throwsParseException();
    System.out.println("结束程序");
}
```

声明式处理异常不是真正的处理异常，仅仅是甩锅，异常之后的代码没有机会执行。

#### 捕获处理异常

捕获处理异常就是捕获异常之后进行处理

Java提供了try/catch来捕获异常并进行相关的处理
try/catch的语法格式

```java
try{
	可能会发生异常的代码
} catch (异常类型变量名){
	异常处理的代码
}
```

try/catch的执行流程

- 首先执行try，如果try语句块发生了异常，那么tny语句块剩下的语句不会再执行了，直接进入到catch语句块，执行异常处理的代码。然后继续往下执行

```java
/**
 * 捕获处理异常
 * 有异常的处理流程
 */
@Test
public void testTryCatchWithException() {
    DateFormat dateFormat = new SimpleDateFormat(  "yyyy-MM-dd");
    try {
        System.out.println("begin try");
        dateFormat.parse( "2021年5月14日");
        System.out.println("end try");
    }catch(ParseException e){
        System.out.println("程序发生了异常");
    }

    // 捕获处理异常后即使遇到了异常，catch代码块之后的代码依然会执行
    System.out.println("程序正常结束");

}
```

- 首先执行try，如果try语句没有发生异常，那么就不会执行catch语句块的异常处理代码，而是直接继续往下执行

```java
/**
 * 捕获处理异常
 * 无异常的处理流程
 */
@Test
public void testTryCatchWithoutException() {
    DateFormat dateFormat = new SimpleDateFormat(  "yyyy-MM-dd");
    try {
        System.out.println("begin try");
        dateFormat.parse( "2021-05-14");
        System.out.println("end try");
    }catch(ParseException e){
        System.out.println("程序发生了异常");
    }

    // 捕获处理异常后即使遇到了异常，catch代码块之后的代码依然会执行
    System.out.println("程序正常结束");

}
```



抛出多个异常和捕获多个异常（运行时异常）

```java
/**
 * 抛出了两个运行时异常
 * 分别捕获多个异常
 * 同时捕获多个异常
 * @param flag
 */
public void throwMultiRuntimeException(int flag){
    try {
        if(flag == 1){
            throw new NullPointerException("空指针异常");
        } else if(flag == 2) {
            throw new IllegalArgumentException("参数非法");
        }
    } // Java7以后允许catch多个异常，但是异常的类型必须是平级的，也就是有共同的父类
    catch (NullPointerException | IllegalArgumentException e) {
        throw new RuntimeException(e);
    }
}
```

```java
/**
 * 捕获多个异常的测试方法
 */
@Test
public void testInvokeThrowMultiRuntimeException() {
    throwMultiRuntimeException(1);
    throwMultiRuntimeException(2);
}
```



#### try/catch/finally

在捕获处理异常时，异常会引发程序跳转，导致有些语句执行不到，而finally语句块就解决了这个问题：有些特定的代码无论是否发生了异常，都需要执行，此时就可以使用到finally语句块，而且finally语句块通常都是和try/catch语句结合使用。

需要注意的是有些非常极端的情况finally语句块不会执行，例如System.exit(-1)退出虚拟机或者系统宕机。

try/catch/finally的语法格式：

```java
try{
	可能会发生异常的代码
} catch(异常类型变量名){
	异常处理的代码
} fina1ly{
	//fina11y语句块
}
```

try/catch/finally 的执行流程

- 首先执行try，如果try语句块发生了异常，那么try语句块剩下的语句不会再执行了，直接进入到catch语句块，执行异常处理的代码。然后继续往下执行finally语句块
- 首先执行try，如果try语句没有发生异常，那么就不会执行catch语句块的异常处理代码，而是直接继续往下执行finally语句块

```java
    /**
     * try/catch/finally的使用
     */
    @Test
    public void testTryCatchFinally(){
        Scanner input =null;

        try {
            input = new Scanner(System.in);
            System.out.println(1 / 0);
            // 关闭资源
            input.close();
            System.out.println("在try代码块中关闭Scanner");
        } catch (Exception ex){
            System.out.println("系统发生了异常");
//            return;
            // 异常退出JVM
            System.exit(-1);
        } finally {
            input.close();
            System.out.println("在finally代码块中关闭Scanner");
        }
        // 如果catch中使用了return，此处的代码不会被执行
        System.out.println("程序正常结束");
    }
```

- catch代码块中有return语句,finally语句块依然会执行。
- 如果catch中使用了return，此处的代码不会执行

finally的应用场景主要是用来关闭资源，例如IO操作、数据库操作等等。

### 5.异常的注意事项

1. 如果父类的方法throws声明抛出多个异常，子类在重写父类方法时，只能throws声明抛出相同的异常或者是它的子类。

```java
class Father {
    /**
     * 获取文件信息
     * @throws IOException
     */
    public void getFileInfo() throws IOException {

    }
}
class child extends Father {
    @Override
    public void getFileInfo() throws FileNotFoundException {

    }
}
```

```java
/**
 * 方法重写的异常注意事项
 */
@Test
public void testGetFileInfo() {
    Father father = new Child();
    try {
        father.getFileInfo();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

2. 父类的方法没有抛出异常，那么子类重写父类方法时也不可以抛出异常，如果子类产生了异常，只能try/catch捕获处理，不能使用throws声明抛出。

```java
class Father {
    /**
     * 获取文件信息
     * @throws IOException
     */
    public void getFileInfo() {

    }
}
class child extends Father {
    @Override
    public void getFileInfo() {
		try {
            throw new FileNotFoundException("文件不存在");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```



```java
/**
 * 方法重写的异常注意事项
 */
@Test
public void testGetFileInfo() {
    Father father = new Child();
    father.getFileInfo(); 
}
```



### 6.自定义异常的使用

自定义异常就是要定义异常类，因为JDK的开发人员不知道我们要开发什么业务系统，因此我们业务开发人员需要根据自身的业务逻辑来开发对应的异常类。

- 要开发编译时异常继承java.lang.Exception
- 要开发运行时异常继承java.lang.RuntimeException

项目开发时通常都是定义RuntimeException的子类作为业务异常

在注册网站时，会检测用户名是否存在，如果存在就会提该用户名已经被占用，因此我们就需要定义一个异常类

**自定义异常类**

```java
public class RegisterException extends RuntimeException{

    public RegisterException(String message) {
        super(message);
    }
}
```

**自定义异常的使用**

```java
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("请输入你的用户名：");
    String userName = input.nextLine();

    if (userName.equals("Max")) {
        try {
            throw new RegisterException("用户名以被注册");
        } catch (RegisterException e) {
            System.out.println("请更换用户名后重试");
        } finally {
            input.close();
        }
    } else {
        System.out.println("用户名注册成功");
    }
}
```

#### 最佳实践

现在都是微服务时代，一个大型的分布式系统会被拆成若干个子系统，系统和子系统之间通过HTTP调用接口来实现数据的交互，那么接口调用时可能发生一些异常情况（数据库GG，网络超时），此时我们就可以把调用接口的代码用try/catch/finally包起来，然后在catch中循环重试，至于重试的频率，次数根据业务的轻重来权衡。以此来保证服务的稳定性。



## 并发编程

### 并发核心概念

#### 1.进程和线程

> 操作系统（Windows10，macOs，Ubuntu Server）都支持多进程、多线程、多用户、多核CPU

进程：当程序从磁盘加载到内存中运行的实例就是进程，进程它是操作系统来分配系统资源(CPU，内存，磁盘，网络)的基本调度单位。

线程：线程是CPU的调度单位，线程负责执行进程的相关代码片段

当程序加载到内存，操作系统就会创建程序的进程和线程，通常都是一个进程对应多个线程。线程负责执行具体的任务来实现进程对外提供的各种功能。I
**进程和线程的区别**

1. 创建顺序不同，先有进程，再有线程，进程是线程的容器，线程在进程中运行。
2. 数量不同：通常都是一个进程对应多个线程。
3. 共享内存不同：进程之间通常不进行内存共享，线程之间通常都是进行内存共享
4. 系统开销不同：进程的创建和销毁的系统开销大于线程的创建和销毁

#### 2.并发和并行

并发指的是单核CPU在执行多个任务，由于多个任务之间的切换时间非常短（ms），就造成了一种看似同时在执行任务。

但是实际上单核CPU无法在同一个时间同时处理多个任务。

生活中并发的例子：体育老师一天要带4个班级，上午带两个，下午带两个。重点是不是同时带4个班.

**并行**指的是多核CPU同时处理多个任务，每个CPU核心对应一个任务，这个才是真正意义上的同时处理。

并行一定是并发，但是并发不是并行。

生活中并行的例子：4车道的高速公路允许4辆车同时运行。

#### 3.多线程和高并发

高并发指的是服务器端同时收到了大量的客户端请求

高并发是系统的一种状态。

高并发的例子

> - 12306 抢票
> - 春节抢红包
> - 双11
> - 618

**高并发的指标**

> - QPS
> - PV
> - UV
> - 并发连接数
> - 服务器平均请求等待时间

多线程：当程序运行之后，对应进程有多个线程在同时运行，那么这个程序就是多线程的程序。

现在绝大多数程序都是多线程的。

高并发不一定是多线程，高并发是系统的一种状态。

多线程是高并发的其中一种解决方案

常见的高并发的解决方案：

> - 多线程，可以充分利用CPU的计算能力，提高系统的吞吐量
> - Redis 降低数据库的压力
> - RabbitMQ，Kafka，RocketMQ

#### 4.Java线程调度机制

线程调度的两种机制

- 分时调度：所有的线程轮流使用CPU的使用权，平均分配每个CPU的占用时间
- 抢占式调度：优先让优先级高的线程使用CPU，如果优先级相同，那就是哪个线程抢到了CPU就执行哪个线程的任务

抢占式的例子：排队打饭。
Java线程调度机制就是抢占式，那就是哪个线程抢到了CPU就执行哪个线程的任务，这样意味着程序在运行的时候可能会有不同的结果。
不过我们可以通过一些机制（同步）来控制多个线程执行的规律。

### 线程创建启动

#### 1.线程的创建

java.lang.Thread类表示一个线程，如果创建一个Thread类的对象，就表示创建一个线程对象。

**Thread类的常用构造方法**

- public Thread()表示使用系统设置的线程名称来创建Thread对象，例如Thread-0
- public Thread(Runnable target)表示使用系统设置的线程名称以及指定的线程任务来创建Thread对象
- public Thread(Runnable target,String name)使用指定的线程任务以及指定的线程名称来创建Thread对象

**Thread类的常用方法**

- run方法 表示线程执行的任务
- start() 启动线程

**创建线程方式**

1. 继承Thread类，重写run方法

```java
public class ThreadCreateStartTest {
    /**
     * main方法也是一个线程，即主线程
     * 主线程有JVM创建
     * JVM启动的时候，还创建了一些其他的线程
     * @param args
     */
    public static void main(String[] args) {
        // 创建Thread类的子类对象
        CustomThread customThread = new CustomThread();
        // 调用Thread类的start()方法
        customThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i = " + i);
        }
    }
}

/**
 * 第一种创建线程的方式
 * 继承Thread类 重写run方法
 */
class CustomThread extends Thread {
    /**
     *
     */
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j = " + j);
        }
    }
}
```

2. 实现Runnable接口，重写run方法

```java
public class ThreadCreateStartTest {

    /**
     * main方法也是一个线程，即主线程
     * 主线程有JVM创建
     * JVM启动的时候，还创建了一些其他的线程
     * @param args
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new CustomRunnable());
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i = " + i);
        }
    }
}

/**
 * 第二种实现线程的方式
 * 实现Runnable接口，重写run方法
 */
class CustomRunnable implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j = " + j);
        }
    }
}
```

网上说的线程创建的方式 有两种，三种，四种，五种。

使用匿名内部类和lambda表达式语法来创建和启动线程

```java
// 匿名内部类的方式创建线程
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("匿名内部类创建线程");
        Logger.getGlobal().info("Logger：匿名内部类创建线程");
    }
}).start();

// lambda表达式建线程
new Thread(() -> {
    System.out.println("匿名内部类创建线程");
    Logger.getGlobal().info("Logger：匿名内部类创建线程");
}).start(); 
```

**官方说的两种**

1. 和线程绑定，继承Thread类
2. 和线程解耦，实现Runnable,Callable接口

**两种创建线程方式的区别**

1. 继承Thread类，那么就不能继承其他的父类，因为]ava只支持单继承，但是如果是实现Runnable接口，还可以实现其他接口，也可以继承其他父类

2. 继承Thread类，那么这个类就和线程绑定。实现Runnable接口，Callable接口，关注的是线程任务，这样就和线程分离(解耦)

3. 如果多个线程执行的任务相同，实现Runnable接口就可以实现任务复用。

4. 线程池提交任务的时候，只会接收Runnable接口的实现类，不接受Thread



#### 2.线程的启动

线程的线程是调用Thread类的**start()方法**开启线程，调用run方法不会开启新线程(例如Thread-0)



### 线程执行原理

