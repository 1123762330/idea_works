package cn.day10.demo.interfacedemo2;

public interface MyInterface {
    void method();
    void method2();
    void method3();
    //新添加一个方法为默认方法
    default void defaultMethod(){
        System.out.println("这里可以放新的方法体,不会影响实现类");
        method4();//直接调用私有方法,解决代码重复问题
    }

    //私有方法,只能在本类中使用
    private void method4(){
        System.out.println("AAA");
        System.out.println("BBB");
    }
}
