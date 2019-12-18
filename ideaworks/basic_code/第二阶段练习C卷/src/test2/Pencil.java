package test2;

public class Pencil extends Pen implements WriteAction {
    @Override
    public void write() {
        System.out.println("现在使用的是价格为"+getPrice()+"的"+getColor()+"颜色的铅笔");
    }

    public Pencil() {
    }

    public Pencil(Float price, String color) {
        super(price, color);
    }
}

