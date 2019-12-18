package cn.test6;

/*定义一个无返回值，参数为String[] 数组的方法，实现以下功能：
        1)  把数组中的元素存入到一个ArrayList集合中，删除集合中包含0-9数字的字符串
        (只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)。
        2)  遍历该集合打印剩余元素。
        在main方法中，定义一个字符串数组String arr[]={“0af3s2sf”,”s6ds1”,”jjww”,”lailai”}，
        并将这个字符串数组传入上述方法中，进行测试。*/

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        String[] arr={"0af3s2sf","6ds1","667899fufyu","jjww","lailai","bklhjl353"};
        removeShuJu(arr);//单独调用方法
    }

    public static void removeShuJu(String[] arr){
        ArrayList<String> list= new ArrayList<>();//定义集合
        for (int i = 0; i < arr.length; i++) {//遍历数组
           list.add(arr[i]);//将具体数据添加都list集合中
        }
/*        System.out.println("原先数组字符串元素是:");
        System.out.println(list);*/
        for (int i = arr.length-1; i >= 0; i--) {//反遍历字符串数组
            char[] ch = arr[i].toCharArray();//将字符串转换成字符数组
            for (int i1 = ch.length - 1; i1 >= 0; i1--) {//将字符数组进行反遍历
                if ('0' <= ch[i1] && ch[i1] <= '9') {//判断有没有包含数字
                    list.remove(i);//有的话就移除这个字符串
                    break;
                }
            }
        }

        System.out.println("删除有数字的字符串之后的集合元素有:");//换行
        System.out.println(list);
    }
}
