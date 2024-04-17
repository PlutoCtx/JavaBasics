package com.example.object.oop.enums;

/**
 * 枚举季节
 *
 * @author MaxBrooks chentingxian195467.163.com
 * since jdk17
 * @version 2022/8/12 15:32
 */
public enum Season {
    /**
     * public static final Season SPRING = new Season("")
     */
    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * 根据描述获取枚举实例（枚举值）
     * @param description  描述
     * @return  枚举值
     */
    public static Season getSeasonByDescription(String description){

        for (Season value : Season.values()) {
            if (description.equals(value.getDescription())){
                return value;
            }
        }
        return null;

    }





    /***********************枚举的构造方法**************************/


//    // 该构造方法默认私有
//    Season(){
//        System.out.println("枚举的实例初始化");
//    }

    Season(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return "季节{" +
                "季节描述='" + description + '\'' +
                '}';
    }
}
