package demo.loger;

//使用Lambda进行优化
public class LogerDemo_2 {
    public static void main(String[] args) {
        String msg="你好呀";
        String msg2="小伙子";
        String msg3="你呢";
        show(1,()->{ return msg+msg2+msg3; });
    }

    private static void show(int level, MessageBuilder mb) {
    //对日志进行等级判断
        if(level==1){
            System.out.println();
        }
    }
}
