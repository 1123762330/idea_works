package cn.day.practice;

import java.util.Scanner;
//库存管理案例
public class KuCunDemo {
    public static void main(String[] args) {
        //定义系统菜单
        caiDan();
        //定义成员对象
        String[] name={"联想","华为","华硕"};//创建电脑名称数组
        double[] size={11,14,15.5};//电脑尺寸大小
        double[] prices={2900,3200,4500};//定义电脑售价金额
        int[] count={10,6,7};//电脑数量

        //功能按钮选择
        while(true){
            int choose=chooseFunction();
            switch(choose){
                case 1:
                    printFunction(name,size,prices,count);
                    break;
                case 2:
                    updateFunction(name,count);
                    break;
                case 3:
                    exit();
                    break;
                default:
                    System.out.println("你输入的数字不存在");
                    break;
            }
        }
    }
    //定义一个菜单界面方法
    public static void caiDan(){
        System.out.println("*************库存管理系统*************");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品数量");
        System.out.println("3.退出系统");
        System.out.println("请输入你的指令:");
    }

    //创建一个选择方法,用来选择相应的功能
    public static int chooseFunction(){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        return i;
    }

    //创建一个遍历库存的方法
    public static void printFunction(String[] name,double[] size,double[] prices,int[] count){
        System.out.println("------------库存清单------------");
        for(int j=0;j<name.length;j++){
            System.out.println("品牌:"+name[j]+" 尺寸:"+size[j]+" 售价:"+prices[j]+" 库存数量:"+count[j]);
        }

    }

    //创建一个修改数量方法
    public static void updateFunction(String[] name,int[] count){
        System.out.println("------------修改商品库存数量-----------");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();//从键盘输入下标查看某台电脑的原始库存量
        System.out.println("品牌:"+name[x]+" 库存数量:"+count[x]);//输出原始库存量
        int c=sc.nextInt();//输入要修改的数量
        count[x] = c;//修改下标为x的电脑的库存数量
        System.out.println("品牌:"+name[x]+" 修改后的库存数量:"+count[x]);//输出修改后的值
        //name.set(x,"戴尔");

    }

    //创建一个退出方法
    public static void exit(){
        System.out.println("------------退出系统界面------------");
        System.out.println("你已退出系统");
    }
}
