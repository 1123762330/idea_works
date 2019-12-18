package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

/*双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）*/
public class Test12 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Random random = new Random();
        Integer blueNum=random.nextInt(16)+1;
        HashSet<Integer> list = new HashSet<>();//无序不重复
        ArrayList<Integer> list1 = new ArrayList<>();//存放球
        for (int i = 0; i < 6; i++) {
            Integer redNum=random.nextInt(33)+1;
            if(!list.contains(redNum)){
                list.add(redNum);
            }else {
                i--;
            }
        }
        list1.addAll(list);//再把list集合添加到ArrayList里面
        list1.add(blueNum);//把篮球也加到球框里

        System.out.println(list1.subList(0,6));
        System.out.println(list1.get(6));
    }
}
