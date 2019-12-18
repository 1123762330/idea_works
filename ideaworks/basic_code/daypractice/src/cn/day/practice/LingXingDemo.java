package cn.day.practice;

import  java.util.Scanner;

public class LingXingDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        for(int x=0;x<num;x++){
            for(int y=0;y<num-x;y++){
                System.out.print(" ");
            }
            for(int n=0;n<x+1;n++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int x=num-1;x>0;x--){

            for(int y=0;y<=num-x;y++){
                System.out.print(" ");
            }
            for(int n=0;n<x;n++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
