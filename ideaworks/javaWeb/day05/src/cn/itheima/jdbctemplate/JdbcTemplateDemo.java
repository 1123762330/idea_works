package cn.itheima.jdbctemplate;

import cn.itheima.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo {
    public static void main(String[] args)  {
        //创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建sql语句
        String sql="update account set balance = balance + ? where id = ?";
        //调用方法
        int i = template.update(sql, 100, 2);
        System.out.println(i);
    }
}
