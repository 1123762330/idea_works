package cn.day.practice;
import java.util.ArrayList;

public class ArrayDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int sum=0;

        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        System.out.println(sum);
    }

}

