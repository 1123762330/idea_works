<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功</title>
</head>
<body>
<h1><span style="color: crimson"><%=request.getSession().getAttribute("username")%></span>管理员,欢迎您,您可以查看所有的用户信息
,<a href="${pageContext.request.contextPath}/pageServlet">点击查看</a></h1>

</body>

</html>
