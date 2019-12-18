package cn.day03.demo.practice;

public class Demo5 {
    /*
    (1)定义一个整数代表月份,范围1-12
	(2)输出该月份对应的季节
		3,4,5春季
		6,7,8夏季
		9,10,11秋季
		12,1,2冬季
	(3)演示格式如下:
		定义的一个月份是3
		控制台输出:3月份是春季
     */
    public static void main(String[] args) {
//        method();
        int month =5;
        if(month == 12 || month == 1 || month == 2) {
            System.out.println("冬季");
        }else if(month >= 3 && month <= 5) {
            System.out.println("春天");
        }else if(month >= 6 && month <= 8) {
            System.out.println("夏天");
        }else if(month >= 9 && month <= 11) {
            System.out.println("秋天");
        }else {
            System.out.println("月份有误");
        }
    }

    private static void method() {
        int month = 3;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("月份有误");
                break;
        }
    }
}
