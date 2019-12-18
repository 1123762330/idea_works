package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.Serviceimpl;
import com.itheima.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建对象
        UserService serviceimpl = new Serviceimpl();
        List<User> users = serviceimpl.findAllUser();
        //将list存入request域中
        request.setAttribute("users",users);
        //调准页面
        System.out.println(users);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
