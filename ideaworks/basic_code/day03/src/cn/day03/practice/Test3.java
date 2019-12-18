package cn.day03.practice;
/*
    1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 */
public class Test3 {
    public static void main(String[] args){
        //第一种方法,不建议使用
        double height=0.0001;//定义纸张的厚度
        int cishu;//定义层数
        for(cishu=0;height<8848;height*=2){
            cishu++;
        //System.out.println(cishu+",高度是"+height);
        }
        System.out.println(cishu);

      //第二种方法
       double b=0.0001;
       int c=0;
       while(b<=8848){
          b*=2;
          c++;
      }
        System.out.println(c);

       //第三种方法
        double zhi=0.0001;
        int count=0;
        for(zhi=0.0001;zhi<8848;zhi*=2){
            count++;
        }
        System.out.println(count);
    }
}
