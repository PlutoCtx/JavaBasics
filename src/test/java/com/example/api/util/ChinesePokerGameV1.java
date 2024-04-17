package com.example.api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * JavaBasics
 * 斗地主游戏 V1
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/14 8:36
 * @since JDK17
 */

public class ChinesePokerGameV1 {

    public static void main(String[] args) {
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

        // 2.洗牌
        System.out.println("************************* 2. 洗牌 *************************");

        Collections.shuffle(pokerBox);
        System.out.println("洗牌之后的牌：" + pokerBox);

        // 3.发牌
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
    }
}
