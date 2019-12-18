package demo.list_demo.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        /*1.准备扑克  2.洗牌 3.发牌  4.看牌*/
       //定义一个集合来存储54张牌
        ArrayList<String> poke = new ArrayList<>();

        //定义具体的54张牌
        String[] pai={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] huase={"♣","♦","♥","♠"};

        //还有两张大王,先放到扑克集合中
        poke.add("大王");
        poke.add("小王");

        //将牌进行组合放进集合中
        for (String num:pai){
            for (String hua:huase){
                //System.out.print(hua+num+" ");
                poke.add(hua+num);//将组合好的扑克存放在集合中
            }
        }

        //随机打乱排序
        Collections.shuffle(poke);
        System.out.println(poke);

        //将牌分给三个人,给每个人创建一个集合接收
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> three = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        //首先要判断下,如果到了51张就留底牌
        for (int i = 0; i <poke.size() ; i++) {
            //获取具体的每一张牌
            String p=poke.get(i);
            if(i>=51){
                    dipai.add(p);
            }else if(i%3==0){
                one.add(p);
            }else if(i%3==1){
                two.add(p);
            }else if(i%3==2){
                three.add(p);
            }
        }

        //输出打印每个人的牌
        System.out.println("刘德华:"+one);
        System.out.println("周润发:"+two);
        System.out.println("周星星:"+three);
        System.out.println("底牌是:"+dipai);

    }
}
