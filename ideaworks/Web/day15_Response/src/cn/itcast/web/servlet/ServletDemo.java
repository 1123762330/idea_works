package cn.itcast.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletDemo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            首先获取ServletContext,看他有没有count属性
            如果没有的话,就设置一个count属性
            如果有的话,设置count的属性+1
         */
        ServletContext context = this.getServletContext();

        Integer count = (Integer)context.getAttribute("count");
        if (count == null){
            context.setAttribute("count",1);
        }else {
            context.setAttribute("count",count + 1);
        }
        response.getWriter().println("<h1>"+count+"</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
