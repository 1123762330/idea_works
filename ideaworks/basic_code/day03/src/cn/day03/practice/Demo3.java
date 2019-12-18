package cn.day03.practice;

public class Demo3 {
    /*
    1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
     */
    public static void main(String[] args) {
        //不知道循环次数,就用while循环
//        method();
        double z = 0.0001;
        int h = 8848;
        //定义一个统计变量,统计纸折叠了多少次
        int count = 0;
        //因为不知道循环多少次,我就用死循环
        while (true) {
            z *= 2;
            count++;
            //折叠完成之后,去判断纸的高度是否大于了珠峰的高度
            if(z > h){
                break;
            }
        }
        System.out.println(count);
    }

    private static void method() {
        double z = 0.0001;
        int h = 8848;
        //定义一个统计变量,统计纸折叠了多少次
        int count = 0;
        //条件是如果是true,就进入循环体
        while (z <= 8848) {
            //将纸的高度乘以2
            z *= 2;
            count ++;
        }
        System.out.println("折叠了"+count);
        System.out.println("纸的高度"+z);
    }
}
