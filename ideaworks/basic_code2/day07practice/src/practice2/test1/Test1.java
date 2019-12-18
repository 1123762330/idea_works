package practice2.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        //创建水果实现类
        Fruit fruit = new Fruit();
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //调用方法
        pool.submit(new NetShop(fruit));
        pool.submit(new FrontShop( fruit));
    }
}
