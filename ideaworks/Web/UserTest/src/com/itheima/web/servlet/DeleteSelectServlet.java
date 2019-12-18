package com.itheima.web.servlet;

import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteSelectServlet")
public class DeleteSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有的id
        String[] uids = request.getParameterValues("uid");
        //调用service删除
        UserServiceImpl service = new UserServiceImpl();
        service.delSelectedUser(uids);
        //跳转查询所有的Servlet
        response.sendRedirect(request.getContextPath() + "/pageServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
