package test3;
/*重写抽象方法void describe(Hat hat)：方法内判断hat的color值，若为奇数是红色，若为偶数为黄色，
        并打印该帽子的所有属性（颜色需打印判断后的值：红色或黄色）。
        重写抽象方法List<Hat> piliang(int num)：使用for循环生成num个Hat对象，
        对象的color属性随机赋值，price属性随机生成：范围为20-100（包含20和100），
        type属性赋值为太阳帽。*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FactoryImp implements Factory {
    @Override
    public void describe(Hat hat) {
        //获取Hat的值
        int color=hat.getColor();
        if(color%2==0){
            System.out.println("颜色为黄色,价格为:"+hat.getPrice()+"的"+hat.getType());
        }else{
            System.out.println("颜色为红色,价格为:"+hat.getPrice()+"的"+hat.getType());
        }
    }

    @Override
    public List<Hat> piliang(int num) {
        //定义一个随机数
        Random ran=new Random();
        //定义集合存放帽子
        ArrayList<Hat> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            //产生随机数赋值给color
            int color=ran.nextInt();
            //产生的随机数赋值给price
            int price=ran.nextInt(81)+20;
            //为Hat对象赋值
            Hat hat = new Hat();
            hat.setColor(color);
            hat.setPrice(price);
            hat.setType("太阳帽");

            //将帽子存在集合中
            list.add(hat);
        }
        return list;
    }
}
