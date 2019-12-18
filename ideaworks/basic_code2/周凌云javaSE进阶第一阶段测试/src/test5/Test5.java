package test5;
/*a)创建一个名为“有料”的饮料售货机(VendingMachine), 给“饮料列表属性赋值并添加五种饮料和价格”,
  设置机内剩余现金总额为100.0元。
b)调用售货机的购买饮料方法，键盘录入10元的真币和所要购买的商品从售货机中购买一瓶饮料。*/

import java.util.HashMap;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String, Float> drinkList= new HashMap<>();
        drinkList.put("可乐",3.0F);
        drinkList.put("雪碧",2.5F);
        drinkList.put("果粒橙",6.0F);
        drinkList.put("红茶",3.0F);
        drinkList.put("绿茶",2.5F);
        VendingMachine machine = new VendingMachine("有料",drinkList,100F);
        System.out.println(machine);
        Money money= new Money();

        //调用方法
        machine.shop(money,machine);

    }
}
