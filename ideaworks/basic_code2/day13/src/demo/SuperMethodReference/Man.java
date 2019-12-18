package demo.SuperMethodReference;

public class Man extends Human {
    public static void main(String[] args) {
        new Man().show();
    }

    public void show() {//调用method方法
        //匿名内部类
        method((new Greetable() {
            @Override
            public void greet() {
                new Human().sayHello();//父类调用sayHello
            }
        }));

        //继续优化
        method(()-> super.sayHello());

        //持续优化
        method(super::sayHello);
    }

    @Override
    public void sayHello() {//重写父类的sayHello
        System.out.println("我是子类Man");
    }

    public void method(Greetable g) {//调用接口
        g.greet();
    }


}
