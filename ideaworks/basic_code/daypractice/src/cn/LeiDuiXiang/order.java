package cn.LeiDuiXiang;

public class order {
    String order_id;
    double order_jiage;
    private  double order_zhekoujia;//定义成私有类，只能在类里面使用

    //构造方法   用来给对象快速赋值
    public order(String id,double jiage){
        this.order_id=id;
        this.order_jiage=jiage;
        this.order_zhekoujia=setCalpaymen();//折扣金额直接调用计算方法
    }

    public void setzheKouJia(){
        //this.order_zhekoujia=this.order_jiage*0.9;
        double payment=setCalpaymen();
        this.order_zhekoujia=payment;
    }
    public String getOrder_Id(){
        return order_id;  //返回order的id
    }
    private double setCalpaymen(){
        return this.order_jiage*0.9;//计算总金额的方法,只能在类里面使用
    }

    public double getZongJinE(){
        return order_zhekoujia;     //返回折扣后的总金额
    }
}
