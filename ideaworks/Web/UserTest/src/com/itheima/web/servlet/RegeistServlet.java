package com.itheima.web.servlet;


import com.itheima.domain.AdminUser;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


@WebServlet("/regeistServlet")
public class RegeistServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.指定编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");
        //2.获取请求参数
        Map<String, String[]> map = request.getParameterMap();

        //3.封装user对象
        User regUser = new User();
        try {
            BeanUtils.populate(regUser,map);//调用工具类,将注册对象添加到map集合中
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //4.调用注册登陆方法
        UserService service = new UserServiceImpl();
        int i = service.register(regUser);

        //5.返回结果
        PrintWriter out = response.getWriter();
        if(i==1){
            out.print("注册成功！");
            response.sendRedirect(request.getContextPath() +"/pageServlet");
        }
        else{
            out.print("注册失败！");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
    }

}
