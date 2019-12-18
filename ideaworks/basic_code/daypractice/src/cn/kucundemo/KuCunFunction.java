package cn.kucundemo;

import java.util.ArrayList;
import java.util.Scanner;

public class KuCunFunction {
	// 添加商品方法
	// 查看全部商品方法
	// 修改库存数量方法
	// 刪除商品方法
	// 退出系统方法
	// 创建一个系统菜单
	// 创建一个选择功能方法
	public static ArrayList<KunCun> list = new ArrayList<KunCun>();// 创建容器存储对象

	// 创建添加商品的方法
	public static void addShangPin(ArrayList<KunCun> list) {
		System.out.println("--------------请输入商品信息--------------");
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			KunCun shangpin = new KunCun();// new一个商品对象
			System.out.print("请输入第" + i + "台电脑的名字:");
			shangpin.name = sc.next();
			System.out.print("请输入第" + i + "台电脑的尺寸大小:");
			shangpin.sizes = sc.nextDouble();
			System.out.print("请输入第" + i + "台电脑的售价:");
			shangpin.prices = sc.nextDouble();
			System.out.print("请输入第" + i + "台电脑的数量:");
			shangpin.count = sc.nextInt();
			list.add(shangpin);// 添加商品到存储容器中去
		}
		System.out.println("商品添加成功,请继续选择其他功能");
	}

	// 遍历整个库存清单
	public static void printStore(ArrayList<KunCun> list) {
		System.out.println("--------------商品库存清单--------------");
		for (int i = 0; i < list.size(); i++) {
			// 获取商品信息
			KunCun shangpin = list.get(i);
			System.out.print("电脑名称:" + shangpin.name + " 电脑尺寸:"
					+ shangpin.sizes);
			System.out.println(" 电脑售价:" + shangpin.prices + " 电脑数量:"
					+ shangpin.count);
		}
		System.out.println("所有商品都在这里,请继续选择其他功能");
	}

	// 修改商品库存方法
	public static void update(ArrayList<KunCun> list) {
		System.out.println("------------修改商品库存数量-----------");
		System.out.println("请输入你要修改的电脑信息");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();// 从键盘输入下标查看某台电脑的原始库存量
		KunCun shangpin = list.get(x);// 获取库存中的x下标的电脑信息
		System.out.print("电脑名称:" + shangpin.name + " 电脑尺寸:" + shangpin.sizes);// 输出要修改的电脑信息
		System.out.println(" 电脑售价:" + shangpin.prices + " 电脑数量:"
				+ shangpin.count);// 输出要修改的电脑信息
		shangpin.count = sc.nextInt();// 输入要修改的数量
		int xin = shangpin.count;// 定义一个新的变量做为修改后的数据
		System.out.println(xin);// 输出修改后的数量
		System.out.println("商品修改成功,请继续选择其他功能");
	}

	// 刪除商品库存方法
	public static void delShangPin(ArrayList<KunCun> list) {
		System.out.println("------------刪除商品-----------");
		System.out.print("请输入你要刪除的电脑编号:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();// 从键盘输入某台电脑的下标
		list.remove(x);// 删除库存中的x下标的电脑信息
		System.out.println("商品刪除成功,请继续选择其他功能");
	}

	// 退出系统
	public static void exit() {
		System.out.println("--------------退出系统界面----------------");
		System.out.println("你已经退出系统了!");
	}

	// 创建一个系统菜单
	public static void caiDan() {
		System.out.println("--------------商品库存管理系统----------------");
		System.out.println("1.添加商品");
		System.out.println("2.查看库存清单");
		System.out.println("3.修改库存数量");
		System.out.println("4.删除商品");
		System.out.println("5.退出系统");
	}

	// 创建一个选择功能方法
	public static int chooseFunction() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}

}
