package practice;

public class Test2 {
    public static void main(String[] args) {
        int sum = method(24);
        System.out.println("24个月之后兔子的总和有:"+sum);
    }

    private static int method(int n) {
        if(n==1 || n==2){
            return 1;
        }
        return method(n-1)+method(n-2);
    }
}
