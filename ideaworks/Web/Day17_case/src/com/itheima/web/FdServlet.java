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

@WebServlet("/fdServlet")
public class FdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        //调用service方法进行查询
        UserService service = new Serviceimpl();
        User user = service.findById(id);
        //将user存入到request域中
        request.setAttribute("user",user);

        //转发到update.jsp页面
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
