package cn.itheima.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/*
jdbc工具类
        1.加载驱动
        2.获取连接
        3.释放资源
 */
public class JdbcUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;
    static {
        try {
            //加载配置文件
            Properties properties = new Properties();
            String path = JdbcUtils.class.getClassLoader().getResource("jdbc.properties").getPath();
            properties.load(new FileReader(path));
            //获取配置文件中的数据
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            //1.加载驱动
            Class.forName(driver);
            //2.通过配置获取数据库的三要素

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //获取连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //释放资源
    public static void close(Connection conn, Statement stat) {
        close(conn,stat,null);
    }

    public static void close(Connection conn, Statement stat, ResultSet rs) {
        if (stat != null){
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stat = null;
        }

        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
        }

        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
