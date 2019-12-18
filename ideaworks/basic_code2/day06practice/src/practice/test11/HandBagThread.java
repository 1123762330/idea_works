package practice.test11;

class HandBagThread implements Runnable {
    private int packeg;
    int guanwang = 0;
    int shitidian = 0;
    String lock = "lock";

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (packeg >= 0 && packeg < 100) {
                    if (Thread.currentThread().getName().equals("官网")) {
                        guanwang++;
                    }

                    if (Thread.currentThread().getName().equals("实体店")) {
                        shitidian++;
                    }
                }

                //执行完这个循环后,包数量自增1
                packeg++;

                //当包的个数等于100个的时候,就输出结果
                if (packeg == 100) {
                    System.out.println("官网店卖出了" + guanwang + "个包包");
                    System.out.println("实体店卖出了" + shitidian + "个包包");
                }
            }
        }
    }
}
