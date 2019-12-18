package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.Serviceimpl;
import com.itheima.service.impl.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("utf-8");
        //获取所有元素
        Map<String, String[]> map = request.getParameterMap();
        //创建user对象
        User user = new User();
        //封装成user对象
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //service来修改数据
        UserService service = new Serviceimpl();
        service.updateUser(user);

        //修改完成之后跳转到查询页面
        response.sendRedirect(request.getContextPath()+"/findUserServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
