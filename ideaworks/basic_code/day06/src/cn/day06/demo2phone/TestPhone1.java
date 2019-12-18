package cn.day06.demo2phone;
//Phone类型作为参数传递
public class TestPhone1 {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.brand="华为";
        phone1.price=2300.0;
        phone1.color="黑色";
        //直接访问成员方法
        getPhone(phone1);

    }
    public static void getPhone(Phone p){
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);
    }
}
