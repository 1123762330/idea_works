package test3;
//1.定义一个Ticket火车票类, 成员变量：ticketNum火车票的数量
public class Ticket {
    int ticketNum;
    boolean falg=false;//创建标记

    public Ticket() {
    }

    public Ticket(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }
}
