package demo.andThen;

import java.util.function.Consumer;

public class andThenDemo {
    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        printInfo(arr,(message)->{
            //消费方式:对message进行切割,获取姓名,按照指定的格式输出
            String name = message.split(",")[0];
            System.out.print("姓名: "+name);
        },(message)->{
            //消费方式:对message进行切割,获取年龄,按照指定的格式输出
            String age = message.split(",")[1];
            System.out.println("。年龄: "+age+"。");
        });

    }
    public static void printInfo(String[] arr, Consumer<String>con1,Consumer<String>con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
