package com.itheima.web;

import com.itheima.domain.PageBean;
import com.itheima.domain.User;
import com.itheima.service.Serviceimpl;
import com.itheima.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("utf-8");
        //获取参数
        String currentPage = request.getParameter("currentPage");//当前的页码
        String rows = request.getParameter("rows");//每页的条数
        if (currentPage != null || "".equals(currentPage)){
            currentPage="1";
        }
        if (rows != null || "".equals(rows)){
            rows="5";
        }

        //调用service查询
        UserService service = new Serviceimpl();
        PageBean<User> pb = service.findUserByPage(currentPage,rows);

        System.out.println(pb);

        //存入request
        request.setAttribute("pb",pb);
        //转发到list.jsp页面
        request.getRequestDispatcher("/list.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
