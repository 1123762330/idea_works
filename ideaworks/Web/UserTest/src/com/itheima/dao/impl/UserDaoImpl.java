package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.AdminUser;
import com.itheima.domain.User;
import com.itheima.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    //查询所有用户
    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;

    }

    //用户登录
    @Override
    public AdminUser login(AdminUser adminUser) {
        try {
            //1.编写sql
            String sql = "select * from adminuser where username = ? and password = ?";
            //2.调用query方法
            AdminUser user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<AdminUser>(AdminUser.class),
                    adminUser.getUserName(), adminUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            //e.printStackTrace();//记录日志
            return null;
        }
    }

    //注册用户
    @Override
    public int register(User user) {
        try {
            String sql = "insert into user values(null,?,?,?,?,?,?)";
            int i = template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(),
                    user.getQq(), user.getEmail());
            return i;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

    //删除用户
    @Override
    public int deleteUser(int id) {
        //1.定义sql
        String sql = "delete from user where id = ?";
        //2.执行sql
        int i = template.update(sql, id);
        return i;
    }

    //删除选中用户
    @Override
    public void deleteSelectUser(int id) {
        //1.定义sql
        String sql = "delete from user where id = ?";
        //2.执行sql
        template.update(sql, id);
    }

    //回显用户信息
    @Override
    public User findUser(int id) {
        String sql = "select * from user where id=?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    //修改用户信息
    @Override
    public void updateUser(User user) {
        String sql = "update user set name = ?,gender = ? ,age = ? , address = ? , qq = ?, email = ? where id = ?";
        ;
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(),
                user.getQq(), user.getEmail(), user.getId());
    }

    //查询总记录数
    @Override
    public int findToTalCount(Map<String, String[]> condition) {
        //定义一个模板sql
        String sql="select count(*) from user where 1=1";
        StringBuilder sb = new StringBuilder(sql);
        //2.遍历map
        Set<String> keySet = condition.keySet();
        //定义参数的集合
        List<Object> params = new ArrayList<>();
        for (String key : keySet) {
            //排除分页条件
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }

            //获取value
            String value = condition.get(key)[0];
            //判断value是否有值
            if (value != null && !"".equals(value)) {
                //有值
                sb.append(" and " + key + " like ? ");
                params.add("%" + value + "%");//?条件的值
            }
        }

        System.out.println(sb.toString());
        System.out.println(params);

        return template.queryForObject(sb.toString(), Integer.class,params.toArray());
    }

    //分页查询每页记录
    @Override
    public List<User> findByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from user where 1=1";

        StringBuilder sb = new StringBuilder(sql);
        //2.遍历map
        Set<String> keySet = condition.keySet();
        //定义参数的集合
        List<Object> params = new ArrayList<>();
        for (String key : keySet) {
            //排除分页条件
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }

            //获取value
            String value = condition.get(key)[0];
            //判断value是否有值
            if (value != null && !"".equals(value)) {
                //有值
                sb.append(" and " + key + " like ? ");
                params.add("%" + value + "%");//?条件的值
            }
        }

        //添加分页查询
        sb.append(" limit ?,? ");
        //添加分页查询参数值
        params.add(start);
        params.add(rows);
        sql = sb.toString();
        System.out.println(sql);
        System.out.println(params);

        return template.query(sql, new BeanPropertyRowMapper<User>(User.class), params.toArray());
    }
}
