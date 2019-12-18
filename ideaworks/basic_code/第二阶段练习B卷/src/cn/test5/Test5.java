package cn.test5;
/*定义测试类Test，完成以下要求：
        ②在main方法内完成以下要求:
        a.根据以下内容创建并初始化3个Phone对象
        {"小米MIX2",2999,"新机皇"}
        {"Iphone8", 5888,"火爆新机"}
        {"VIVO X9s",1998,"火爆新机"}
        b.创建一个ArrayList<Phone> list，将上面的3个Phone对象添加到list中，调用filter方法传入list和2000，
        根据返回的集合输出所有元素信息*/

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();//创建集合对象

        //创建Phone类对象
        Phone p=new Phone("小米MIX2",2999,"新机皇");
        Phone p1=new Phone("Iphone8", 5888,"火爆新机");
        Phone p2=new Phone("VIVO X9s",1998,"火爆新机");

        //存储对象
        list.add(p);
        list.add(p1);
        list.add(p2);

        //调用方法
        ArrayList<Phone> phone2=filter(list,2000);//创建一个集合对象来调用方法
        //遍历phone2集合输出
        for (int i = 0; i < phone2.size(); i++) {
            Phone phone3=phone2.get(i);//创建一个类对象来接收phone2集合遍历的数据
            System.out.println(phone3.getName()+" "+phone3.getPrice()+" "+phone3.getType());
        }
    }

 /*   ①定义public static ArrayList<Phone> filter(ArrayList<Phone> list,int price) {...}方法:
    要求：遍历list集合，将list中价格大于参数price的元素存入到一个新的集合中并返回*/

    public static ArrayList<Phone> filter(ArrayList<Phone> list,int price) {
        //创建新集合
        ArrayList<Phone> list2=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone phone=list.get(i);//将遍历的具体数据赋值给phone
            if(phone.getPrice()>2000){//判断遍历的手机价格是否大于2000,是的就添加到新集合list2中
            list2.add(phone);
            }
        }
        return list2;//返回新建集合2
    }

}
