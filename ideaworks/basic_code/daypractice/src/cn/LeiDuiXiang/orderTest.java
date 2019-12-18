package cn.LeiDuiXiang;

public class orderTest {
	public static void main(String[]args){
		order order1= new order("001",1800);
		//order1.order_id="001";
		//order1.order_jiage=1800;
		//order1.order_zhekoujia=order1.order_jiage*0.9;
		//order1.setzheKouJia();
		System.out.println("订单1的ID："+order1.getOrder_Id());
		System.out.println("订单1的总金额："+order1.getZongJinE());

		order order2= new order("002",300);
		//order2.order_id="002";
		//order2.order_jiage=300;
		//order2.order_zhekoujia=order2.order_jiage*0.8;
		//order2.setzheKouJia();

		//System.out.println("物品2的id:"+order2.order_id+"\n"+"物品2的折扣价:"+order2.order_zhekoujia);
		//直接调用方法
		System.out.println("订单2的ID："+order2.getOrder_Id());
		System.out.println("订单2的总金额："+order2.getZongJinE());
	}
}
