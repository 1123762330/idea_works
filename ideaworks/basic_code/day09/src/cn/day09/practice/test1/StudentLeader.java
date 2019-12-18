package cn.day09.practice.test1;
/*增加属性：
        职务job；
        方法:
        增加方法：开会meeting。*/
public class StudentLeader extends Student {
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String sex, int age, String nationality,
                         String school, String stuNumber, String job) {
        super(name, sex, age, nationality, school, stuNumber);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void work(String name){
        System.out.println(name+"开会");
    }
}
