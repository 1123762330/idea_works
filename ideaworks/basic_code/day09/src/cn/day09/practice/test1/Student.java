package cn.day09.practice.test1;
/*增加属性：
        学校school、学号stuNumber；
        方法:
        重写工作方法（学生的工作是学习）。*/
public class Student extends Person{
    private String school;
    private String stuNumber;

    public Student() {
    }

    public Student(String name, String sex, int age, String nationality, String school, String stuNumber) {
        super(name, sex, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }


    public void work(String name) {
        System.out.println(name+"学习");
    }
}
