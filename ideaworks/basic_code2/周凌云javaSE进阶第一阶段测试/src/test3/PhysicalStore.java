package test3;

public class PhysicalStore implements Runnable {
    private Ticket ticket;//定义火车票变量

    public PhysicalStore() {
    }

    public PhysicalStore(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            synchronized (ticket){
                if(ticket.falg==true){
                    try {
                        ticket.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ticket.ticketNum++;

                if (ticket.ticketNum > 0 && ticket.ticketNum <= 100) {
                    System.out.println("线下窗口正在卖出第" + ticket.ticketNum + "张票，还剩余" + (100 - ticket.ticketNum) + "张");
                    ticket.falg = true;
                    ticket.notify();
                }
            }
        }

    }
}
