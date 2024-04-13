package com.example.api.util;

/**
 * 字符串工具类
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:00
 */

public class StringUtils {
    /**
     * 字符串反转
     * @param str
     * @return
     */
    public static String reverse(String str){
        if (str == null){
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

        /**
         * 整数数组转字符串
         * @param array
         * @return
         */
        public static String arrayToString(int[] array) {
            if (null == array){
                return "null";
            }
            int maxIndex = array.length - 1;
            //空数组
            if (maxIndex == -1){
                return "[]";
            }
            StringBuilder builder = new StringBuilder("[");
            for (int i = 0; i < array.length; i++) {
                if (i != maxIndex){
                    builder.append(array[i]).append(", ");
                }else {
                    builder.append(array[i]).append("]");
                }
            }
            return builder.toString();
        }

}
