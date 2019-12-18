package cn.day.practice;
/*定义一个replace方法用于遍历数组，将数组中小于10的元素替换成100，然后打印修改后的数组中的元素;
        在main方法中定义一个int型数组{5,35,6,20,2,68,75,8,10,9}，调用replace方法完成测试.*/

public class Test2 {
    public static void main(String[] args) {
        int[] arrA={5,35,6,20,2,68,75,8,10,9};
        replace(arrA);
    }

    //创建方法
    public static void replace(int[] arrA){
        for (int i = 0; i <arrA.length ; i++) {
            if(arrA[i]<10){
                arrA[i]=100;
            }
            System.out.print(arrA[i]+" ");
        }
    }
}
