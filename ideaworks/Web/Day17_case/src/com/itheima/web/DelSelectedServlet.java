package com.itheima.web;

import com.itheima.service.Serviceimpl;
import com.itheima.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSelectedServlet")
public class DelSelectedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有的id
        String[] uids = request.getParameterValues("uid");
        //调用service方法
        UserService service = new Serviceimpl();
        service.delSelectUsers(uids);

        //跳转页面,没有共享数据,用重定向吧
        response.sendRedirect(request.getContextPath()+"/findUserServlet");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
