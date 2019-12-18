package com.itheima.web.servlet;

import com.itheima.domain.User;
import com.itheima.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/updateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.指定编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");
        //2.获取请求参数
        Map<String, String[]> map = request.getParameterMap();

        //3.封装user对象
        User user = new User();
        try {
            BeanUtils.populate(user, map);//调用工具类,将注册对象添加到map集合中
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //4.调用修改方法
        UserServiceImpl service = new UserServiceImpl();
        service.updateUser(user);
        //5.跳转到所有用户界面
        response.sendRedirect(request.getContextPath() + "/pageServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
