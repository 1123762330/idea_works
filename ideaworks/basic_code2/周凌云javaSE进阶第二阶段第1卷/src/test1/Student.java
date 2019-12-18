package test1;

public class Student {
    private String name;
    private int yscore;
    private int sscore;
    private int sum;

    public Student() {
    }

    public Student(String name, int yscore, int sscore, int sum) {
        this.name = name;
        this.yscore = yscore;
        this.sscore = sscore;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYscore() {
        return yscore;
    }

    public void setYscore(int yscore) {
        this.yscore = yscore;
    }

    public int getSscore() {
        return sscore;
    }

    public void setSscore(int sscore) {
        this.sscore = sscore;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
