package com.itheima.web.servlet;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1.获取id
            String id = request.getParameter("id");
            //2.调用service删除
            UserService service = new UserServiceImpl();
            int i = service.deleteUser(id);
            //3.返回结果
            PrintWriter out = response.getWriter();
            if (i == 1) {
                out.print("删除成功！");
                //3.跳转到查询所有Servlet
                response.sendRedirect(request.getContextPath() + "/pageServlet");
            } else {
                out.print("删除失败！");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
