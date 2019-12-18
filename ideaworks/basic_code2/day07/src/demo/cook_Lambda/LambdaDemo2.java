package demo.cook_Lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //接口匿名内部类
        Cook c = new Cook() {
            @Override
            public void eat() {
                System.out.println("第一种吃饭了");
            }
        };
        eatMethod(c);//方法调用

        //方法直接调用接口匿名内部类
        eatMethod(new Cook() {
            @Override
            public void eat() {
                System.out.println("第五种吃饭了");
            }
        });


        //Lambda表达式简写
        Cook c2=()->{System.out.println("第二种吃饭了");};
        eatMethod(c2);

        //省略格式
        eatMethod(()->{
            System.out.println("第三种吃饭了");
        });

        //终极Lambda表达式
        eatMethod(()-> System.out.println("第四种吃饭了"));

    }

    //自定义一个吃饭方法
    public static void eatMethod(Cook c) {
        c.eat();
    }
}


