package com.day06.practice.phone;
/*属性:
        品牌brand
        价格price
        行为:
        打电话call()
        发短信sendMessage()
        玩游戏playGame()
*/
public class Phone {
    //定义成员变量
    String brand;
    double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //定义打电话方法
    public String  call() {
        String s="打电话";
        return s;
    }

    //定义发短信方法
    public String sendMessage() {

       String f="发短信";
       return f;
    }

    //定义打游戏
    public String playGame(){
        String youxi="打游戏";
        return youxi;
    }
}
