package practice;

public class ZuiDaShu {
    public static void main(String[] args) {
        int[] array = {12,1,2,45,30,50};
        int maxIndex = array[0];//定义最大值为该数组的第一个数
        int minIndex = array[0];//定义最小值为该数组的第一个数
        //遍历循环数组
        for (int i = 0; i < array.length; i++) {
            if(maxIndex < array[i]){
                maxIndex = array[i];
            }
            if(minIndex > array[i]){
                minIndex = array[i];
            }
        }
        System.out.println("这个数组的最大值为："+maxIndex+"\t最小值为："+minIndex);
    }
}