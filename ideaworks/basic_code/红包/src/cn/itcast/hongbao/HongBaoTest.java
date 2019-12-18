package cn.itcast.hongbao;

public class HongBaoTest {
    public static void main(String[] args) {
        MyHongBao hongbao = new MyHongBao("微信红包");//创建程序名称标题
        hongbao.setOwnerName("周凌云");//设置群主名称
        /*AvgHongBao avgHongBao = new AvgHongBao();//创建一个平分红包
        hongbao.setOpenWay(avgHongBao);//打开平分红包*/
        RandomHongBao randomHongBao = new RandomHongBao();//创建一个随机红包
        hongbao.setOpenWay(randomHongBao);//打开随机红包

    }
}
