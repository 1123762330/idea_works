package cn.itheima.jdbctemplate;

import java.sql.*;

public class JdbcInsert {
    public static void main(String[] args) {
        Statement stmt=null;
        PreparedStatement pstmt =null;
        Connection conn=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "root");

            //3.定义sql
            String sql="INSERT INTO account (NAME, balance) VALUES ('王五', 1000)";
            //4.获取sql对象 Statement
            stmt = conn.createStatement();

            // 3.定义sql
            String sql2 ="INSERT INTO account (id,NAME, balance) VALUES(NULL, ?, ?)";
            // 4.获取sql执行对象并赋值
            pstmt = conn.prepareStatement(sql2);
            pstmt.setString(1,"王五");
            pstmt.setString(2,"1000");

            //5.执行sql
            int i = stmt.executeUpdate(sql);
            //6.处理结果,注意增删改语句是没有结果集的
            System.out.println(i);
            if(i>0){
                System.out.println("数据添加成功");
            }else {
                System.out.println("数据添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 7.释放资源
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
