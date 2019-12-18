package cn.itheima.test1.dao;

import cn.itheima.test1.entity.User;
import cn.itheima.utils.DataSourceUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserDao {
    public User login(String name, String password){
        User user=null;
        try {
            //创建JDBCTemplate对象
            JdbcTemplate template = new JdbcTemplate(DataSourceUtils.getDataSource());
            String sql = "select * from user where name =? and password =?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),name,password);
        } catch (EmptyResultDataAccessException e) {
            //e.printStackTrace();
        }
        return user;
    }
}
