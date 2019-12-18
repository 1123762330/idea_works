package practice.test8;
/*每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常*/

public class ScoreOutOfBoundsException extends Exception {
    private String name;
    private  int number;
    private  double score;

    public ScoreOutOfBoundsException() {
    }

    public ScoreOutOfBoundsException(String message) {
        super(message);
    }

}
