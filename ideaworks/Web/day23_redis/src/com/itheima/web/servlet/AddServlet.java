package com.itheima.web.servlet;

import com.itheima.dao.impl.ProvinceDaoImpl;
import com.itheima.domain.Province;
import com.itheima.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //指定编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");
        //获取请求参数
        String name = request.getParameter("cityname");
        //3.封装对象
        Province city = new Province();
        city.setName(name);
        //4.调用方法
        ProvinceServiceImpl service = new ProvinceServiceImpl();
        service.addName(city.getName());
        //5.返回结果
        response.sendRedirect(request.getContextPath()+"/index.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
