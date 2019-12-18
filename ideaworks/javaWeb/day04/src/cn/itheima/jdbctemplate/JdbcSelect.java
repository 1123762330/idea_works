package cn.itheima.jdbctemplate;

import java.sql.*;

public class JdbcSelect {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "root");
            //3.定义sql
            String sql = "SELECT * from account";
            //4.获取sql对象 Statement
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.处理结果
            //6.1让光标向下移动一行
            rs.next();
            //6.2获取数据
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double balance = rs.getDouble(3);

            System.out.println("id="+id+",name="+name+",balance="+balance);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

