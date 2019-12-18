package cn.day06.demo2phone;

public class TestPhone {
    public static void main(String[] args) {
        //创建实例
        Phone one=new Phone();

        //访问成员变量
        String phoneName=one.brand="华为";
        double price=one.price=3200.0;
        String phoneColor=one.color="魅夜黑";
        System.out.println(phoneName+price+phoneColor);

        //访问成员方法
        one.call("爸爸");
        one.message();
    }
}
