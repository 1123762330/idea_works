package cn.day07.demo;

import java.util.ArrayList;
import java.util.Random;
/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。

分析：
1. 需要创建一个大集合，用来存储int数字：<Integer>
2. 随机数字就用Random nextInt
3. 循环20次，把随机数字放入大集合：for循环、add方法
4. 定义一个方法，用来进行筛选。
筛选：根据大集合，筛选符合要求的元素，得到小集合。
三要素
返回值类型：ArrayList小集合（里面元素个数不确定）
方法名称：getSmallList
参数列表：ArrayList大集合（装着20个随机数字）
5. 判断（if）是偶数：num % 2 == 0
6. 如果是偶数，就放到小集合当中，否则不放。
 */

public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();//创建集合对象
        //添加数据
        Random ran=new Random();//随机创建20个数
        for (int i = 0; i < 20; i++) {
            int r=ran.nextInt(100)+1;//范围在1~100之间
            bigList.add(r);//把随机产生的数字添加到大集合中
        }

        ArrayList<Integer> smallList=getSmallList(bigList);//创建一个对象来调用小集合方法

        System.out.println("偶数总共有多少个"+smallList.size());//输出小集合的长度
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));//遍历输出小集合的具体数据
        }
    }

    //把大集合数据放在小集合里面
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        //创建一个小集合用来接收大集合的数据
        ArrayList<Integer> smallList=new ArrayList<>();
        //遍历大集合
        for (int i = 0; i < bigList.size(); i++) {
            int num=bigList.get(i);//定义一个变量用来接收大集合遍历的具体数据
            if(num%2==0){//判断如果为偶数就添加到集合中
                smallList.add(num);//将符合的数据添加到小集合中
            }
        }
        return smallList;//返回小集合
    }
}
