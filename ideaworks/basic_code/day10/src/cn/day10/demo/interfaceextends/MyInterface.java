package cn.day10.demo.interfaceextends;

public interface MyInterface extends InterfaceA,InterfaceB {
    public abstract void myMethod();

    @Override
    default void defaultMethod() {
        System.out.println("我想自己选择");
    }
}
