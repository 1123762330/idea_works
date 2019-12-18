package cn.itheima.jdbctemplate.login;

import cn.itheima.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();
        boolean flag = login(username, password);
        if(flag){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }

    private static boolean login(String username,String password) {
        //判断数据库是否登陆成功如果用户名或者密码为空就报错
        if(username == null || password ==null){
            return false;
        }

        Connection conn =null;
        Statement stmt =null;
        ResultSet rs =null;
        try {
            //1.创建新连接
            conn = JdbcUtils.getConnection();
            //2.定义sql
            String sql="SELECT * FROM USER WHERE username='"+username+"' AND password='"+password+"'";
            //3.获取执行sql的对象
            stmt = conn.createStatement();
            //4.执行sql
            rs = stmt.executeQuery(sql);
            //5.判断
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.释放资源
            JdbcUtils.close(conn,stmt,rs);
        }
        return false;
    }
}
