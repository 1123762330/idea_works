package practice;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args){
		//创建一个random类型
		Random ran=new Random();
		int i=ran.nextInt(10);//括号里一定要给出范围值
		Double d=ran.nextDouble();//小数范围值能是1
		System.out.println("随机数是："+i);
		System.out.println("随机小数是："+d);
	}

}
