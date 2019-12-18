package cn.day.practice;

public class SwitchDemo {
    public static void main(String[] args) {
        int x = 8,y=3;

        switch(x)
        {
            default:
                y++;
            case 8:
                y=y++;
            case 4:
                y++;
        }

        System.out.println("y="+y);

    }
}
