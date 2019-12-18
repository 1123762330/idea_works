package cn.day06.demo2phone;
//Phone作为返回值类型
public class TesePhone2 {
    public static void main(String[] args) {
        Phone phone2=getPhone();
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
        System.out.println(phone2.color);

    }

    public static Phone getPhone(){
        Phone phone1=new Phone();
        phone1.brand="小米";
        phone1.price=1200.0;
        phone1.color="金色";
        return phone1;
    }
}
