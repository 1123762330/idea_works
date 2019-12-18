package cn.day.practice;

public class ChengFaKouJue {
    public static void main(String[] args) {
        for (int j = 1; j < 10; j++) {//控制竖列
            for (int k = 1; k <= j; k++) {//控制行
                System.out.print(k +"*"+ j +"="+ j*k +"\t");
            }
            System.out.println();//换行
        }
    }
}
