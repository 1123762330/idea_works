<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.itheima.util.CookieUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<%
Cookie[] cs = request.getCookies();
Cookie cookie = CookieUtils.getCookie(cs, "username");
String username = "";
String checked = "";

if (cookie != null) {
username = cookie.getValue();
checked = "checked = 'checked'";
}
%>
<form action='/loginServlet' method='post'>
用户名:<input type='text' name='username' value='<%=username%>' /><br />
密码:<input type='text' name='password' /><br />
<input type='submit' value='登录' />
<input type='checkbox' name='remember' value='1'<%=checked%> />记住用户名
</form>
</body>
</html>
