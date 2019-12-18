package demo.innerclass;

public class Body {
    private  String name;

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){//外部类的方法
        System.out.println("这是外部的身体");
        Heart heart=new Heart();//创建内部类对象
        heart.beat();//对象调用内部类方法
    }

    public  class Heart{
        public  void beat(){
            System.out.println("心脏砰砰跳");
        }
    }
}
