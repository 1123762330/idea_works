package cn.day.practice;
/*定义一个方法printNum, 求1-500之内能同时被2，5，7整除的所有数 ,打印格式要求2个一行打印输出,
并统计满足条件的个数, 在主方法中调用此方法完成测试. */
public class Test4 {
    public static void main(String[] args) {
        printNum();//单独使用
    }
    public static void printNum(){
        int count=0;//定义个数
        for (int i = 1; i < 500; i++) {
            if(i%2==0 && i%5==0 && i%7==0){
                count++;//同时满足条件的次数自增
                System.out.print(i+" ");//输出相应的数
                if(count%2==0){//如果次数%2等于0,那就换行
                    System.out.println();
                }
            }
        }
        System.out.println("满足条件的个数有"+count);

    }
}
