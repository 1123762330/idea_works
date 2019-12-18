<%@ page language="java" import="cn.itheima.dao.UserDao" pageEncoding="UTF-8"%>
<%@ page import="cn.itheima.domain.User" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'modiUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
        int id = Integer.parseInt(request.getParameter("id"));  //获取从allUser.jsp超链接中传递过来的参数
        User user = (User) new UserDao().searchUserById(id);  //调用searchUserById(id)方法查找用户，并封装为对象
   %>
  <body>
  
    <p>获取我们要修改的用户的信息   userid</p>
    
    
    <p>&nbsp;</p>
    <form name="form1" method="post" action="/users/updateServlet?userId=<%=user.getUserId() %>">
      <table width="433" height="123" border="0" align="center" cellpadding="0" cellspacing="1">
        <tr>
          <td height="32" colspan="3" align="center" bgcolor="#FF9933">修改用户信息</td>
        </tr>
       
       
        <tr>
          <td align="center" bgcolor="#FFC993">用户名：</td>
          <td bgcolor="#FFC993"><input name="username" type="text" id="textfield" value="<%=user.getUserName() %>"></td>
          <td bgcolor="#FFC993">&nbsp;</td>
        </tr>
        <tr>
          <td align="center" bgcolor="#FF9933">密码：</td>
          <td bgcolor="#FF9933"><input name="password" type="password" id="textfield2" value="<%=user.getPassword() %>"></td>
          <td align="center" bgcolor="#FF9933">&nbsp;</td>
        </tr>
        <tr>
          <td colspan="3" align="center" bgcolor="#FF9933"><input type="submit" name="button" id="button" value="提交">
          <input type="reset" name="button2" id="button2" value="重置"></td>
        </tr>
      </table>
</form>
    <p>&nbsp;</p>
  </body>
</html>
