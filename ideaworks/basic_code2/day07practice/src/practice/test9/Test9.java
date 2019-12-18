package practice.test9;

public class Test9 {
    public static void main(String[] args) {
        // TODO 请分别使用Lambda【省略格式】调用invokeDirect方法
        invokeDirect(()-> System.out.println("导演拍电影啦！"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}

