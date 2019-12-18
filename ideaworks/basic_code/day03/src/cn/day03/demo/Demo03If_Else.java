package cn.day03.demo;

public class Demo03If_Else {
        public static void main(String[] args) {
            int a = 15;
            int b = 11 ;
            int c = 30;

            //排序
            if(a > b) {
                if(b > c) {
                    System.out.println("排序结果是1："+a+","+b+","+c);
                }else if(a > c){
                    System.out.println("排序结果是2："+a+","+c+","+b);
                }else {
                    System.out.println("排序结果是3："+c+","+a+","+b);
                }
            }

            if(a < b) {
                if(b < c) {
                    System.out.println("排序结果是4："+c+","+b+","+a);
                }else if(a > c){
                    System.out.println("排序结果是5："+b+","+a+","+c);
                }else {
                    System.out.println("排序结果是6："+b+","+c+","+a);
                }
            }

        //求三个数中的最大值
        if (a > b) {
            if (a > c) {
                System.out.println("最大值是" + a);
            } else{
                System.out.println("max=" + c);
            }
        } else if (b > c) {
            System.out.println("max是" + b);
        } else {
            System.out.println("max=" + c);
        }
        //求最大值
        int max =    (a > b)&& (a > c)  ? a : ((b > c) ? b : c);
        System.out.println("最大值:"+max);
    }
}

