package demo;

public class DiGuiDemo {
    public static void main(String[] args) {
        int sum = gewSum(6);
        System.out.println(sum);
    }

    private static int gewSum(int num) {
        if(num==1){
            return 1;
        }

        return num+gewSum(num-1);
    }
}
