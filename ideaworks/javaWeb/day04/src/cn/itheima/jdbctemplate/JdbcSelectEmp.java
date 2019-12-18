package cn.itheima.jdbctemplate;

import cn.itheima.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcSelectEmp {
    public static void main(String[] args) {
        System.out.println(findAll());
    }

    private static List<Emp> findAll() {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs=null;
        ArrayList<Emp> list=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "root");
            //3.定义sql
            String sql = "SELECT * from emp";
            //4.获取sql对象 Statement
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.处理结果
            //6.1循环判断是否是最后一行末尾
            Emp emp=null;
            list = new ArrayList<>();
            while (rs.next()){
                //6.2获取所有数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");


                //创建emp对象
                emp = new Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);
                //将对象存放在集合中
                list.add(emp);
            }
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
            return list;
        }
    }
}
