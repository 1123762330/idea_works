package demo.test;

public class Test01 {
    public static void main(String[] args) {

        InterImpl ii = new InterImpl();

        method(ii);

    }



    public static void method(Inter i) {

        i.print();

    }

}
