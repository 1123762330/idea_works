package cn.day03.practice;
//打印1到100之内的整数，但数字中包含9的要跳过（十位包含9，个位包含9）
public class Test2 {
    public static void main(String[] args){
        for(int i=1;i<=200;i++){
            if(i%10==9 || i/10%10==9){
                continue;
            }
            System.out.println(i);
        }

    }
}
