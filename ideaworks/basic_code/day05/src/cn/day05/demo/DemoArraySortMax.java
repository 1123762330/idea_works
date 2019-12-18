package cn.day05.demo;

class DemoArraySortMax {
    public static void main(String[] args) {
        int arr[] = { 9,45, 6, 7, 8, 9, 5, 76 };
        //先遍历一下数组
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        //数组数据从小到大
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
           }
        }
        //遍历反转后的数组并且打印输出
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        //最大值
        System.out.println("max = "+arr[arr.length-1]);
    }
}
