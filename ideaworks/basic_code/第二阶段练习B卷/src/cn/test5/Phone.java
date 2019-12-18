package cn.test5;
/*定义手机类Phone 包含空参构造、满参构造和以下成员变量：
        名称name（String类型）
        价格price（int类型）
        类型type（String类型）
        生成以上成员变量的set/get方法*/

public class Phone {
    private String name;
    private int price;
    private String type;

    public Phone() {
    }

    public Phone(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
