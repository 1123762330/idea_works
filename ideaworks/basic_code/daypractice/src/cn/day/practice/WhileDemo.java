package cn.day.practice;

public class WhileDemo {
    public static void main(String[] args) {
        int days=1;
        while(days>10){
            System.out.println("工作第一天"+days);
            days=days+days;
        }
    }

}
