package cn.day07.demo;
import java.util.Scanner;
public class ScannerForMax {
    /*
    题目：
    键盘输入三个int数字，然后求出其中的最大值。

    思路：
    1. 既然是键盘输入，肯定需要用到Scanner
    2. Scanner三个步骤：导包、创建、使用nextInt()方法
    3. 既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
    4. 无法同时判断三个数字谁最大，应该转换成为两个步骤：
        4.1 首先判断前两个当中谁最大，拿到前两个的最大值
        4.2 拿着前两个中的最大值，再和第三个数字比较，得到三个数字当中的最大值
    5. 打印最终结果
     */
        public static void main(String[] args) {
            // method1();
            Scanner sc = new Scanner(System.in);
            //定义一个最大值的变量
            int max = 0;
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入第"+(i+1)+"个数");
                int i1 = sc.nextInt();
                if(i == 0){
                    max = i1;
                }else {
                    if(i1 > max){
                        max = i1;
                    }
                }
            }
            System.out.println(max);
        }

        private static void method1() {
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("请输入第"+(i+1)+"个数");
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }

 }


