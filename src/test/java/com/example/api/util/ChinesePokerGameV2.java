package com.example.api.util;

import java.util.*;

/**
 * JavaBasics
 * 斗地主 V2
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/14 9:08
 * @since JDK17
 */

public class ChinesePokerGameV2 {
    public static void main(String[] args) {
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



        // 2.洗牌
        System.out.println("************************* 第二版 2. 洗牌 *************************");
        Set<Integer> idSet = pokerBox.keySet();
        List<Integer> idList = new ArrayList<>(idSet);
        Collections.shuffle(idList);
        System.out.println("洗牌之后的牌：" + idList);

        // 3.发牌
        System.out.println("************************* 第二版 3. 发牌 *************************");

        // 四个集合存放玩家以及底牌的牌
        List<Integer> player1Ids = new ArrayList<>();
        List<Integer> player2Ids = new ArrayList<>();
        List<Integer> player3Ids = new ArrayList<>();
        List<Integer> cardIds = new ArrayList<>();

        for (int i = 0; i < idList.size(); i++) {
            Integer pokerId = idList.get(i);
            if (i >= 51) {
                cardIds.add(pokerId);
            } else if (i % 3 == 0) {
                player1Ids.add(pokerId);
            } else if (i % 3 == 1) {
                player2Ids.add(pokerId);
            } else if (i % 3 == 2) {
                player3Ids.add(pokerId);
            }
        }

        // 根据3个玩家以及底牌的牌的标记到Hap中找到对应的牌存放到另外的四个集合中，这四个集合分别存放3个玩家的牌以及底牌的牌。
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> cards = new ArrayList<>();

        Set<Map.Entry<Integer, String>> entrySet = pokerBox.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            if (player1Ids.contains(entry.getKey())) {
                player1.add(entry.getValue());
            } else if (player2Ids.contains(entry.getKey())) {
                player2.add(entry.getValue());
            } else if (player3Ids.contains(entry.getKey())) {
                player3.add(entry.getValue());
            } else {
                cards.add(entry.getValue());
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
