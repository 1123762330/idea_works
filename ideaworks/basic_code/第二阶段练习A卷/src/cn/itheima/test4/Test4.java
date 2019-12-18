package cn.itheima.test4;
/*2.定义ArrayList集合，存入4个Empl对象，对象的薪资属性分别为100,300,567,678；
        3.遍历集合，将集合中元素的薪资小于等于300的元素删除，将集合中元素的薪资大于300的元素，
        元素值在原来的基础上加100，并在控制台打印输出修改后集合中所有元素的属性*/

import java.util.ArrayList;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Empl> list = new ArrayList<>();//创建集合对象
        Empl empl = new Empl(100);//创建成员变量
        Empl empl2 = new Empl(300);
        Empl empl3 = new Empl(567);
        Empl empl4 = new Empl(678);
        //添加到集合中
        list.add(empl);
        list.add(empl2);
        list.add(empl3);
        list.add(empl4);
        //遍历集合
        for (int i = list.size()-1; i >= 0; i--) {
            Empl emp=list.get(i);//将集合遍历的具体数据存放在变量emp中
            if(emp.getSalary()<=300){//如果这个对象的工资小于等于300,那就移除
                list.remove(i);
            }else{//否则工资就加上100(用set方法)
                emp.setSalary(emp.getSalary()+100);
            }
        }
        System.out.println("修改后的集合为:");
        for (int i = 0; i < list.size(); i++) {//遍历集合输出具体数据
            Empl em=list.get(i);
            System.out.print(em.getSalary()+" ");
        }

    }
}
