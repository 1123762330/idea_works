package practice2.test1;

public class Fruit {
    int stock;//定义水果数量
    boolean flag=false;//创建标记

    public Fruit() {
    }

    public Fruit(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
