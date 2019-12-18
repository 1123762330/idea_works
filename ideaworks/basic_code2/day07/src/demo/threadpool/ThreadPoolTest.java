package demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        //1.创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        //3.调用submit方法,执行任务
        pool.submit(new HelloThread());
        pool.submit(new WorldThread());
        //4.调用shutdown方法,销毁线程池(一般不推荐使用)
        pool.shutdown();
    }
}

