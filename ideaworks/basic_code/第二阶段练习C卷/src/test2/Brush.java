package test2;

public class Brush extends Pen implements WriteAction {
    @Override
    public void write() {
        System.out.println("现在使用的是价格为"+getPrice()+"的"+getColor()+"颜色的画笔");
    }

    public Brush() {
    }

    public Brush(Float price, String color) {
        super(price, color);
    }
}
