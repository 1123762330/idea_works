package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.AdminUser;
import com.itheima.domain.PageBean;
import com.itheima.domain.User;
import com.itheima.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    /*查找所有用户*/
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    /*用户登录*/
    @Override
    public AdminUser login(AdminUser adminUser) {
        return dao.login(adminUser);
    }

    /*用户注册*/
    @Override
    public int register(User user) {
        return dao.register(user);
    }

    /*用户删除*/
    @Override
    public int deleteUser(String id) {
        return dao.deleteUser(Integer.parseInt(id));
    }

    /*选择删除*/
    @Override
    public void delSelectedUser(String[] uids) {
        //遍历数组
        for (String id : uids) {
            dao.deleteSelectUser(Integer.parseInt(id));
        }

    }

    /*回显用户信息*/
    @Override
    public User findUserById(String id) {
        return dao.findUser(Integer.parseInt(id));
    }

    /*修改用户信息*/
    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    /*分页条件查询*/
    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        /*如果页码到了第一页,那么点击上一页就会一直显示第一页*/
        if(currentPage<=0){
            currentPage=1;
        }
        //1.创建空的PageBean对象
        PageBean<User> pb = new PageBean<>();
        //2.设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);
        //3.调用dao查询总记录数
        int totalCount = dao.findToTalCount(condition);
        pb.setTotalCount(totalCount);
        //4.调用dao查询List集合
        //先计算开始记录索引
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start, rows,condition);
        pb.setList(list);
        //5.计算总页码
        int totalPage = totalCount % rows == 0 ? (totalCount / rows) : (totalCount / rows) + 1;
        pb.setTotalPage(totalPage);

        return pb;
    }

}
