package cn.day09.demo.constructor2;

public class Zi extends Fu {
    int num=20;

        public Zi(){//无参构造
            this(123);//无参调用一个参数构造
        }

        public Zi(int num){
            this(1,2);//一个参数构造方法调用两个参数构造
        }

        public Zi(int num,int num2){
            //此处隐藏了一个super()方法
        }

    public  void showNum(){//成员方法
        int num=10;//局部变量
        System.out.println(num);
        System.out.println(this.num);//显示本类的成员变量
        System.out.println(super.num);//显示父类的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
