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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //设置编码格式
        request.setCharacterEncoding("utf-8");
        //获取文本框的验证码
        String verifycode = request.getParameter("verifycode");
        //获取生成的验证码
        HttpSession session = request.getSession();
       String checkcode_server =(String) session.getAttribute("CHECKCODE_SERVER");
       //确保验证码一次性
        session.removeAttribute("CHECKCODE_SERVER");
        //判断验证码是否正确
        if(! checkcode_server.equalsIgnoreCase(verifycode)){
            //验证码不正确
            //提示信息
            request.setAttribute("login_msg","验证码错误");
            //则跳转到登录页面重新登录
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }
        //封装成user对象
        Map<String, String[]> map = request.getParameterMap();
        User user = new User();
        //使用工具类封装成user对象
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        //调用services查询
        UserService userservice = new Serviceimpl();
        User loginuser1 = userservice.login(user);
        System.out.println(loginuser1);
        if (loginuser1 != null){
            //证明登录成功
            //将用户存入session中
            session.setAttribute("user",loginuser1);

            //跳转页面
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }else {
            //登录失败
            request.setAttribute("login_msg","用户名或者密码错误");
            //跳转登录页面,重新登录
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
