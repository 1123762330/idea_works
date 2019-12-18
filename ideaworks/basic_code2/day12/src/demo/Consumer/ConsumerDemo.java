package demo.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        method("赵丽颖", (String name) -> {
            //对传递的字符串进行消费
            //System.out.println(name);

            //消费方式:把字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });


    }
    public static void method (String name, Consumer < String > cons){
        cons.accept(name);
    }
}

