package cn.itheima.datasource.druid;

import cn.itheima.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 连接池工具类的使用
 */
public class DruidDemo_2 {
    public static void main(String[] args)  {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        //4.获取连接池对象
        //5.获取连接
        Connection conn = null;
        PreparedStatement pstmt =null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(null,?,?)";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给？赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            //5.执行sql
            int i = pstmt.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.释放资源
            JDBCUtils.close(pstmt,conn);
        }

    }
}
