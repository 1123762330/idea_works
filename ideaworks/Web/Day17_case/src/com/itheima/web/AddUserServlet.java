package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.Serviceimpl;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/addUserServlet")
public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //设置编码格式
        request.setCharacterEncoding("utf-8");
        //获取
        Map<String, String[]> map = request.getParameterMap();
        //创建user对象
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //调用service保存
        Serviceimpl serviceimpl = new Serviceimpl();
        serviceimpl.addUser(user);

        //存到request域对象
        request.setAttribute("user",user);
        //跳转页面
        response.sendRedirect(request.getContextPath()+"/findUserServlet");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
