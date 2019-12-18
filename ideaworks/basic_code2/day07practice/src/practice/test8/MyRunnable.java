package practice.test8;
/*在MyRunnable实现类中，首先在控制台打印需求，“我需要一个老师”。模拟需要2秒钟时间老师可以过来指导学生，
并在控制台打印老师的姓名。最后，在控制台打印“教我java,教完后，老师回到了办公室”；*/
public class MyRunnable implements Runnable {
    //定义变量 老师的名字
    private String name;

    public MyRunnable() {
    }

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("我需要一个老师");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"来了");
        System.out.println("教我java,教完后，老师回到了办公室");
    }
}
