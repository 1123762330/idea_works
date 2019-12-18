package test3;

//定义一个线上官网线程类：NetWindow，实现Runnable接口,实现卖票的操作
public class NetWindow implements Runnable {
    private Ticket ticket;//定义火车票变量

    public NetWindow() {
    }

    public NetWindow(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ticket) {//同步锁
                if (ticket.falg == false) {
                    try {
                        ticket.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ticket.ticketNum++;//票数自增

                if (ticket.ticketNum > 0 && ticket.ticketNum <= 100) {
                    System.out.println("线上官网正在卖出第" + ticket.ticketNum + "张票，还剩余" + (100 - ticket.ticketNum) + "张");
                    ticket.falg = false;
                    ticket.notify();
                }

            }
        }
    }
}
