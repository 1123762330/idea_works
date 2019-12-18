package cn.day10.practice.test2;
//创建饲养员对象,饲养员调用三次饲养方法:饲养狗,饲养羊,饲养青蛙
public class Test {
    public static void main(String[] args) {
        Breeder siyangyuan=new Breeder();
        siyangyuan.feed(new Dog("狗"));
        siyangyuan.feed(new Frog("青蛙"));
        siyangyuan.feed(new Sheep("羊"));



    }
}
