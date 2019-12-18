package demo;

//可变参数
/*
    可变参数:是JDK1.5之后出现的新特性
    使用前提:
        当方法的参数列表数据类型已经确定,但是参数的个数不确定,就可以使用可变参数.
    使用格式:定义方法时使用
        修饰符 返回值类型 方法名(数据类型...变量名){}
        public static void method(Object... obj) {}
    可变参数的原理:
        可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数
        传递的参数个数,可以是0个(不传递),1,2...多个
 */
public class ChangeArgs {
    public static void main(String[] args) {
        int sumResult = add(10, 20, 67, 50);//这里可以添加多个值
        System.out.println(sumResult);
    }

    public static int add(int... arr) {//相当于int[] arr,但是这里数组长度不用指定
        int sum = 0;
        //遍历数组,获取数组中的每一个元素
        for (int i : arr) {
            //累加求和
            sum += i;
        }
        //把求和结果返回
        return sum;
    }


}
