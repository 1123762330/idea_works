package cn.day10.demo.brid;

public class Test {
    public static void main(String[] args) {
//        YingWu yw = new YingWu();
//        yw.eat();
//        yw.speak();
        CanSpeak cs = new YingWu();
        cs.speak();
        //强转的时候,不在意中间用什么样的类型去引用.要看创建对象的地方,是否是这种类型.
        if(cs instanceof Bird) {
            Bird yw = (Bird) cs;
            yw.eat();
        }
    }
}
