package cn.day.practice;
//1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
//	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
public class CeShiDemo {
    public static void main(String[] args) {
        double zhi=0.0001;
        int cishu=0;
        //第一种方法
        /*while(zhi <=8848){
            zhi*=2;
            cishu++;

        }*/
        System.out.println("折叠了"+cishu+",高度是"+zhi);
    }
}
