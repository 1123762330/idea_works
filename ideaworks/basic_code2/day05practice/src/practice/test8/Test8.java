package practice.test8;

public class Test8 {
    public static void main(String[] args) {
        try {
            printPass(-10);//此处为异常,自动生成
        } catch (ScoreOutOfBoundsException e) {
            e.printStackTrace();//调用的是父类中的方法
        }
    }

    private static void printPass(int score) throws ScoreOutOfBoundsException {
        if(score<0||score>100){
//            System.out.println("成绩不合理");
//            return;
            //如果分数不合理,那就抛出异常
            throw new ScoreOutOfBoundsException("成绩不合理");
        }
        if(score>=60){
            System.out.println("考试通过");
        }else {
            System.out.println("考试不通过");
        }
    }

}
