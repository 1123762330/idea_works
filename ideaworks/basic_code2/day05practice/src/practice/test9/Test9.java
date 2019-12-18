package practice.test9;

public class Test9 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 100; i++) {
            if(i%2==1){
                System.out.println("main主方法:"+i);
            }
        }
    }
}
