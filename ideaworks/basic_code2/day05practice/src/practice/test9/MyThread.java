package practice.test9;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==1){
                System.out.println("run方法:"+i);
            }
        }
    }
}
