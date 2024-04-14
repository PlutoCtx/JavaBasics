package com.example.jdk.feature.java5;

import java.util.ArrayList;

/**
 * JavaBasics
 * 泛型类的定义
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/14 19:35
 * @since JDK17
 */

public class FastArrayList<E> extends ArrayList<E> implements FastList<E> {

    public boolean addElement(E element) {
        return add(element);
    }

}
