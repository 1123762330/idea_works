package cn.day05.demo;

public class DemoArrayArray {
    public static void main(String[] args) {
        int[][] arr2 = { {1,2},{3,4,5},{6,7,8,9,10} };
        int sum2 = 0;
        for (int i=0; i<arr2.length; i++) {//外层循环
            for (int j=0; j<arr2[i].length; j++) {
                System.out.print(arr2[i][j]);//输出二维数组所有数据
                sum2 += arr2[i][j];//所有数据之和
            }
            System.out.println();
        }
        System.out.println("sum2= "+ sum2);

    }
}
