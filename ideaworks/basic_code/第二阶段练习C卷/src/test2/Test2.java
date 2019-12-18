package test2;
/* i.    创建Brush类对象b1,价格赋值为5.8,颜色赋值为红色；
         ii.    创建Pencil类对象p1,价格赋值为2.5,颜色赋值为黑色；
         iii.    创建Painter对象,姓名赋值为王流秋；调用两次Painter的draw方法，分别
         传入b1和p1；进行测试；*/

public class Test2 {
    public static void main(String[] args) {
        Brush b1=new Brush(5.8F,"红色");
        Pencil p1=new Pencil(2.5F,"黑色");
        Painter painter=new Painter("王流秋");
        painter.draw(p1);
        painter.draw(b1);
    }
}
