package test1;

//  1：定义一个图书类Book，要求有如下属性：图书名称、价格、数量。并完成对应构造以及geter与setter功能；
public class Book {
    private String bookname;
    private double price;
    private int num;

    public Book(String bookname, double v, String num) {
    }

    public Book(String bookname, double price, int num) {
        this.bookname = bookname;
        this.price = price;
        this.num = num;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
