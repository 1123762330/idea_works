package demo.sum_Lambda;

public class SumLambdaTest {
    public static void main(String[] args) {

        sum(10, 20, new Calculator() {
            @Override
            public int calcul(int a, int b) {
                return a + b;
            }
        });

        //使用lambda标准格式
        sum(12, 32, (int a, int b) -> {
            return a + b;
        });

        //使用Lambda简化格式
        sum(14, 34, (a, b) -> a + b);
    }

    public static void sum(int a, int b, Calculator calculator) {
        int sum = calculator.calcul(a, b);
        System.out.println(sum);
    }
}
