package test3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new NetWindow(ticket));//创建网上线程
        pool.submit(new PhysicalStore(ticket));//创建线下线程
    }
}
