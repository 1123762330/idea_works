package cn.day03.demo.practice;

public class Demo2 {
    /*
    打印1到100之内的整数，但数字中包含9的要跳过（十位包含9，个位包含9）
     */
    public static void main(String[] args) {
//      method();
        for (int i = 1; i <= 100; i++) {
            //不包含9的我去输出
            if(i % 10 != 9 && i / 10 % 10 != 9){
                System.out.println(i);
            }
        }
    }
    public static void method() {
        //知道循环次数用for循环
        for (int i = 1; i <= 100; i++) {
            //将数字中包含9的跳过
            if(i % 10 ==9 || i / 10 % 10 == 9){
                continue;
            }
            System.out.println(i);
        }
    }
}
