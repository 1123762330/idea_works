package cn.itheima.test1.view;

import cn.itheima.test1.dao.UserDao;
import cn.itheima.test1.entity.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserView userView = new UserView();
        userView.login();
    }

    public void login() {
        UserDao dao = new UserDao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scanner.nextLine();
        System.out.println("请输入密码:");
        String password = scanner.nextLine();
        User user = dao.login(name, password);
        if (user != null) {
            if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                System.out.println("登陆成功,欢迎:" + name);
            } else {
                System.out.println("用户名或账号错误,登录失败");
            }
        } else {
            System.out.println("用户名或账号错误,登录失败");
        }
    }
}
