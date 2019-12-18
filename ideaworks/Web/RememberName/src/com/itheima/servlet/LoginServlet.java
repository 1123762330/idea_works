package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应类型和编码
        response.setContentType("text/html;charset=UTF-8");
        //获取输出流对象
        PrintWriter out = response.getWriter();

        //获取用户名
        String username = request.getParameter("username");
        //获取密码
        String password = request.getParameter("password");
        //获取复选框记住用户名的值
        String remember = request.getParameter("remember");

        System.out.println(username);
        System.out.println(password);

        //判断用户名和密码是否有效
        if ("zly".equals(username) && "123456".equals(password)) {
            //登录成功
            out.println("登录成功,3秒后跳转首页");
            response.setHeader("Refresh", "3;URL=/index.jsp");

            if ("1".equals(remember)) {
                //需要记住用户名
                //创建Cookie对象
                Cookie cookie = new Cookie("username", username);
                //设置cookie的有效时间
                cookie.setMaxAge(Integer.MAX_VALUE);
                //发送cookie至客户端
                response.addCookie(cookie);
            }else {
                //不需要记住用户名
                Cookie cookie = new Cookie("username", "");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }

        }else {
            //登录失败
            out.println("用户名或者密码错误,3秒后跳转到登录页面");
            response.setHeader("Refresh", "3;URL=/remeberNameServlet");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
