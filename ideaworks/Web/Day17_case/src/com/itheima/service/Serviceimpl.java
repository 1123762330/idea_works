package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.dao.UserDaoImpl;
import com.itheima.domain.PageBean;
import com.itheima.domain.User;
import com.itheima.service.impl.UserService;

import java.util.List;

public class Serviceimpl implements UserService{
    private UserDao dao = new UserDaoImpl();

    /**
     * 查找所有用户
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return dao.findAll();
    }

    /**
     * 添加用户
     * @param user
     */

    public void addUser(User user) {
        dao.addUser(user);

    }

    /**
     * 管路员登录
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        return dao.loginuser(user.getUsername(),user.getPassword());
    }

    /**
     * 删除用户
     * @param id
     */

    @Override
    public void deleteUser(String id) {
        dao.deleteUser(Integer.parseInt(id));
    }


    /**
     * 修改用户
     * @param user
     */
    @Override
    public void updateUser(User user) {
        dao.updateUser(user);

    }


    @Override
    public User findById(String id) {
       return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void delSelectUsers(String[] ids) {
        //判断数组是否为空再调用方法遍历
        if(ids != null && ids.length >0){
            //遍历数组
            for (String id : ids) {
                //调用dao层方法,复用之前的方法
                dao.deleteUser(Integer.parseInt(id));
            }
        }
    }

    @Override
    public PageBean<User> findUserByPage(String  _currentPage, String  _rows) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        //创建空的PageBean对象
        PageBean<User> pb = new PageBean<User>();
        //设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //调用dao查询总记录数
        int totalCount = dao.findTotalCount();
        pb.setTotalCount(totalCount);

        //调用dao查询list集合
        int start = (currentPage - 1) * rows;
        List<User> list  = dao.findByPage(start,rows);
        pb.setList(list);

        //计算总页码
        int totalPage = (totalCount % rows) == 0 ? (totalCount /rows) : (totalCount / rows) + 1;
        pb.setTotalPage(totalPage);

        return pb;
    }


}
