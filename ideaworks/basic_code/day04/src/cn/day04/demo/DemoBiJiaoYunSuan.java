package cn.day04.demo;

public class DemoBiJiaoYunSuan {
    public static void main(String[] args) {
       boolean result=compare(5,7);//调用方法,并传递具体数据
        System.out.println(result);//输出结果
    }

    //定义一个方法
    public static boolean compare(int a,int b) {
        if(a==b){
            return true;
        }else{
           return  false;
        }
    }
}
