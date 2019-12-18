package test9;

import java.util.function.Supplier;

public class Test9{
    public static String  getObj(Supplier<String> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {


    }

}

