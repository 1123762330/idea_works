package cn.itheima.dao;


import cn.itheima.domain.User;
import cn.itheima.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * 操作数据库中User表的类
 */
public class UserDao {

    //声明JDBCTemplate对象共用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录方法
     * @param loginUser 只有用户名和密码
     * @return user包含用户全部数据,没有查询到，返回null
     */
    public User login(User loginUser) {//用户登录
        try {
            //1.编写sql
            String sql = "select * from user where username = ? and password = ?";
            //2.调用query方法
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUserName(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();//记录日志
            return null;
        }
    }

    public int addUser(String username ,String password) {//注册用户第一种方式
        try {
            String sql = "insert into user values(null,?,?)";
            int update = template.update(sql,username,password);
            return update;
        }catch (Exception e){
            e.getMessage();
            return 0;
        }
    }

    public int register(User user) {//注册用户
        try {
            String userName = user.getUserName();
            String password = user.getPassword();
            String sql = "insert into user values(null,?,?)";
            int i = template.update(sql,userName,password);
            return i;
        }catch (Exception e){
            e.getMessage();
            return 0;
        }
    }

    public List<User> getAllUser(){
        try {
        String sql = "select * from user";
        List<User> list = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public int update(User user) {
        try {
            String sql ="update user set userpwd=? , username=?  where userid=?";
            //3. 执行sql
            int updateID = template.update(sql, new BeanPropertyRowMapper<User>(User.class), user.getUserId(),
                    user.getUserName(), user.getPassword());

            return updateID;
        } catch (DataAccessException e) {
            e.printStackTrace();//记录日志
            return 0;
        }
    }

    public  Object searchUserById(int userId){
        try {
            String sql = "select * from user where id = ?";
            Map<String, Object> user = template.queryForMap(sql, userId);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int del(int id) {
        try {
            String sql = "delete from user where id = ?";
            //3. 执行sql
            int userid = template.update(sql, new BeanPropertyRowMapper<User>(User.class),id);

            return userid;
        } catch (DataAccessException e) {
            e.printStackTrace();//记录日志
            return 0;
        }
    }
}
