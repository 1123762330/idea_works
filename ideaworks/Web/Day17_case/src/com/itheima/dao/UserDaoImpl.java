package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao{

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        //定义sql查询语句
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }


    /**
     * 此方法是给表单添加数据
     * @param user
     */
    @Override
    public void addUser(User user) {
      //定义sql语句
        String sql = "insert into user values (null,?,?,?,?,?,?,null,null)";
        template.update(sql,user.getName(),
                user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail());
    }

    @Override
    public User loginuser(String username, String password) {
            //定义sql语句
        try {
            String sql = "select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void deleteUser(int id) {
        String sql = "delete  from user where id = ? ";
        template.update(sql,id);
    }

    @Override
    public void updateUser(User user) {
        //定义sql语句
        String sql = "update user set name = ?,gender = ? ,age = ? , address = ? , qq = ?, email = ? where id = ?";
        template.update(sql,user.getName(),
                user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail(),user.getId());
    }

    @Override
    public User findById(int id) {
        try{
            //定义sql语句
            String sql = "select * from user where id = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class));
            return user;
        } catch (Exception e){
            return null;
        }

    }

    @Override
    public int findTotalCount() {
        //定义sql语句
        String sql = "SELECT COUNT(*) FROM USER";
        return  template.queryForObject(sql,Integer.class);

    }

    @Override
    public List<User> findByPage(int start, int rows) {
        //定义sql语句
        String sql = "select * from user limit ? , ?";
        return template.query(sql,new BeanPropertyRowMapper<User>(User.class),start,rows);
    }


}
