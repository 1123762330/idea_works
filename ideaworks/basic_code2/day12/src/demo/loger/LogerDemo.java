package demo.loger;

//存在性能浪费问题,如果级别不是1,那么字符串拼接就没有意义.存在浪费
public class LogerDemo {
    public static void main(String[] args) {
        String msg="你好呀";
        String msg2="小伙子";
        String msg3="你呢";
        String msgSum=msg+msg2+msg3;

        //调用方法
        showLog(1,msgSum);
    }
        //定义方法
    public static void showLog(int level, String message) {
        if(level==1){
            System.out.println(message);
        }

    }
}
