package cn.day03.demo;

public class Demo03For {
    public  static void main(String[] args){
        for(int i=1;i<=3;i++){
            System.out.println("我错了!");
        }
        System.out.println("=============================");
        int i=0;
        while(i<3){
            System.out.println("我错啦!");
            i++;
        }
        System.out.println("=======================");
        int x=0;
        do{
            System.out.println("你好啊!!!");
            x++;
        }while(x>3);
    }
}
