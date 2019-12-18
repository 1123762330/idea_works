package cn.day03.demo;

public class Demo03Switch {
    public static void main(String[] args){
        int x=2;
        switch (2){
            case 1:
                System.out.println("你好");
                break;
            case 2:
                System.out.println("我好");
                //break;
            case 3:
                System.out.println("大家好");
                break;
            case 4:
                System.out.println("你好吗?");
                break;
             default:
                 System.out.println("数据错误");
                break;
        }
    }
}
