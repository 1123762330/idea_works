package cn.day03.demo;

public class Demo03Continue {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i==4){
                break;
            }
            System.out.println(i+"层到了");
        }
        System.out.println("=========================");
        for(int i=1;i<=10;i++){
            if(i==4){
                continue;
            }
            System.out.println(i+"层到了");
        }
    }
}
