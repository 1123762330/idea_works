package com.itheima.servlet;

import com.itheima.utils.DownLoadUtils;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet2")
public class DownloadServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求参数，文件名称
        String filename = request.getParameter("filename");
        //2找到文件服务器路径
        String realPath=this.getServletContext().getRealPath("/img/" + filename);

        //设置两个头
        //3.1设置响应头类型
        String mimeType = this.getServletContext().getMimeType(filename);//获取文件类型
        response.setHeader("content-type", mimeType);

        //解决中文文件名问题
        //1.获取user-agent请求头、
        String agent = request.getHeader("user-agent");
        //2.使用工具类方法编码文件名即可
        filename = DownLoadUtils.getFileName(agent, filename);

        //3.2设置响应头打开的方式
        response.setHeader("content-disposition","attachment;filename="+filename);

        //设置两个流
        //创建输入流(用来读取服务器上的图片)
        FileInputStream fis = new FileInputStream(realPath);
        //获取输出流(用来将读到的图片发出去)
        ServletOutputStream sos = response.getOutputStream();

        //一对接
        IOUtils.copy(fis,sos);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
