package cn.itheima.jdbctemplate;

import cn.itheima.utils.JdbcUtils;

import java.sql.*;

public class JdbcSelectAll_2 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs=null;
        try {
           //1.获取连接对象
           conn = JdbcUtils.getConnection();
            //3.定义sql
            String sql = "SELECT * from account";
            //4.获取sql对象 Statement
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.处理结果
                //6.1循环判断是否是最后一行末尾
            while (rs.next()){
                //6.2获取所有数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);

                System.out.println("id="+id+",name="+name+",balance="+balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           //7.释放资源
            JdbcUtils.close(conn, stmt, rs);
        }
    }
}

