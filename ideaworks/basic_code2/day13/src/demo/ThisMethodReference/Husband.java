package demo.ThisMethodReference;

public class Husband {
    public static void main(String[] args) {
        new Husband().soHappy();
    }

    public void soHappy(){
        //匿名内部类
        /*marry((new Richable() {
            @Override
            public void buy() {
                buyHouse();
            }
        }));*/

        //使用Lambda表达式
       /* marry(()->this.buyHouse());*/

        //继续优化
        marry(this::buyHouse);
    }

    public void marry(Richable r){//定义一个结婚的方法,调用接口作为参数
        r.buy();
    }

    public void buyHouse(){//成员方法
        System.out.println("北京买房");
    }

}
