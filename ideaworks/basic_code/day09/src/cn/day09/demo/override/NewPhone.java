package cn.day09.demo.override;

public class NewPhone extends Phone {
    //重写方法
    public void showNum() {
        super.showNum();//调用父类已经存在的方法
        System.out.println("显示来电姓名");//增加自己的新功能
        System.out.println("显示头像");
    }
}