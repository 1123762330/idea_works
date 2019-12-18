package practice.test9;
/*
模拟多个人通过一个山洞：
1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。
显示每次通过山洞人的姓名，和通过顺序；*/

public class Test9 {
    public static void main(String[] args) {
        //随机生成10个人
        String[] str = {"小黑", "小周", "小明", "小李", "小王", "小何", "大明", "大鹏", "老大", "老二"};

        //创建一个山洞线程
        new Thread() {
            @Override
            public void run() {
                    System.out.println("共有10个人要通过山洞:");
                    try {
                        for (int i1 = 0; i1 < str.length; i1++) {
                            String name = str[i1];
                            System.out.println(name + "正在通过山洞,是第" + (i1 + 1) + "人");
                            Thread.sleep(50);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        }.start();
    }
}
