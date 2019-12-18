package cn.day10.demo.brid;

public class YingWu extends Bird implements CanSpeak {
    @Override
    public void speak() {
        System.out.println("恭喜发财");
    }
}
