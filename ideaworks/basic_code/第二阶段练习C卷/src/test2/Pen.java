package test2;

public class Pen {
    private Float price;
    private String color;

    public Pen() {
    }

    public Pen(Float price, String color) {
        this.price = price;
        this.color = color;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
