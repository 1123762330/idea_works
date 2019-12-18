package cn.itheima.web.servlet;
//使用注解配置servlet
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//字符串 /day13就相当于一个项目的根目录虚拟路径.
@WebServlet("/day13")
public class Demo implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("服务启动了...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("版本是3.0");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("服务结束了...");
    }
}
