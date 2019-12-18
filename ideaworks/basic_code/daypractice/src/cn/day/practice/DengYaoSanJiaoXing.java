package cn.day.practice;
import java.util.Scanner;
/**
 * 输入行数打印等腰三角形
 */
public class DengYaoSanJiaoXing {
	public static void main(String[] args) {
		int rows = 0;	//三角形行数
		System.out.print("请输入等腰三角形的行数：");
		Scanner input = new Scanner(System.in);
		rows = input.nextInt();
		//打印等腰三角形
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
