package cn.day09.demo.constructor;

public class Zi extends Fu {
   public Zi(){
       super(20);
       System.out.println("子类无参构造");
       System.out.println(super.s);
   }
}
