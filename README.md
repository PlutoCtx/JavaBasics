# Java SE 基础代码

## 进度详情
- [x] 2024.4.14: Map、List与Map的嵌套、泛型编程


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
