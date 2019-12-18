package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/*
斗地主案例：
    1、准备牌
        牌要从小到大进行编号，编号一定要能反映牌面的大小
    2、洗牌，对编号进行洗牌
    3、发牌
    4、看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //创建牌盒,存放牌
        HashMap<Integer, String> pokeMap = new HashMap<>();
        // 定义一个计数器，用于给每一张牌进行编号
        int count = 0;
        //创建牌数组
        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //创建花色数组
        String[] color = {"♥", "♠", "♦", "♣"};
        //遍历集合,进行装盒
        for (String s : num) {
            for (String s1 : color) {
                pokeMap.put(count++, s1 + s);//
            }
        }
        //将大小王装进去
        pokeMap.put(count++, "大王");
        pokeMap.put(count++, "小王");
        //显示整副牌
        System.out.println(pokeMap);

        // 2、洗牌，对编号进行洗牌
        // 获取所有的键，其实就是获取到所有的编号
        Set<Integer> nums = pokeMap.keySet();
        // 创建一个List集合，用于存储所有的编号，方便进行洗牌操作
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(nums);
        Collections.shuffle(list);

        // 3、发牌
        // 创建一个ArrayList集合用于存储底牌
        ArrayList<Integer> dipai = new ArrayList<>();
        // 创建三个ArrayList集合代表三个打牌人
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();


        //首先要判断下,如果到了51张就留底牌
        for (int i = 0; i < list.size(); i++) {
            //获取具体的每一张牌
            Integer p = list.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else if (i % 3 == 0) {
                one.add(p);
            } else if (i % 3 == 1) {
                two.add(p);
            } else if (i % 3 == 2) {
                three.add(p);
            }
        }

        //进行升序,此处升序的是键
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(dipai);

        //看牌,需要遍历键值集合,取到具体的值
        // 4、看牌
        System.out.println("底牌："+lookPoker(dipai,pokeMap));
        System.out.println("马云："+lookPoker(one,pokeMap));
        System.out.println("马化腾："+lookPoker(two,pokeMap));
        System.out.println("黄云："+lookPoker(three,pokeMap));

    }

    public static String lookPoker(ArrayList<Integer> list, HashMap<Integer, String> pokerBox) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {// 拿到编号，其实就是键
            Integer num = list.get(i);
            // 通过键去找值，其实就是找牌
            String pai = pokerBox.get(num);// [红桃3, 黑桃8, 小王]
            sb.append(pai);
            // 最后一张牌
            if (i == list.size() - 1) {
                sb.append("]");
            } else {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
