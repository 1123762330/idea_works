package practice.tset10;
/*分析:
        1.使用数组保存已经注册过的用户名
        2.使用Scanner获取用户输入的注册的用户名
        3.定义一个方法,对用户输入的中注册的用户名进行判断
        遍历存储已经注册过用户名的数组,获取每一个用户名
        使用获取到的用户名和用户输入的用户名比较
        true:用户名已经存在,抛出RegisterException异常,告知用户"亲，
        该用户名已经被注册";
        false:继续遍历比较
        如果循环结束了,还没有找到重复的用户名,提示用户"恭喜您,注册成功!";*/

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的注册用户名:");
        String xm=sc.next();
        try {
            nameJudge(xm);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    private static void nameJudge(String xm) throws RegisterException {
        String[] name={"小红","小明","小亮","小周","小王","小李"};
        for (int i = 0; i < name.length; i++) {
            if(xm.equals(name[i])){
              throw new RegisterException("亲,该用户名已经被注册");
            }else {
                System.out.println("恭喜你,注册成功");
                return;
            }
        }
    }
}
