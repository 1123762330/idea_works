package cn.day05.practice;
/*
分析以下需求，完成作业
	题目:
		(1)定义一个int类型的数组，内容为{171,72,19,16,118,51,210,7,18}
		(2)求出该数组中满足要求的元素和。
	要求：
		求和的元素的个位和十位不能包含7,并且只能为偶数。
*/
public class Test2 {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={171,72,19,16,118,51,210,7,18};
       for (int i = 0; i < arr.length; i++) {
            /* if(arr[i]%10==7||arr[i]/10%10==7 ||arr[i]%2!=0){
                continue;
            }
            sum+=arr[i];
            System.out.println(arr[i]);*/

            //十位上数字不能等于7 个位数字不能等于7  数字只能为偶数
            if(arr[i]%2==0 && arr[i]/10%10!=7 && arr[i]%10!=7){
                        System.out.print(arr[i]+" ");
                        sum+=arr[i];
            }
        }
       System.out.println("总和是:"+sum);
    }
}
