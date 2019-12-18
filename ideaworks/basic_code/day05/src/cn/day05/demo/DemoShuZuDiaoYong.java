package cn.day05.demo;

public class DemoShuZuDiaoYong {
    public static void main(String[] args) {
        int[] array=getArray();
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    //创建数组方法
    public static int[] getArray(){
        int[] arr={1,2,3,4,5,6};
        return arr;
    }
}
