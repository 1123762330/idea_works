<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>用户登录界面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    
    用户登录:
    <form method="post" action="/users/loginServlet">
        <p>&nbsp;</p>
        <table width="302" height="120" border="0" align="center" cellpadding="0" cellspacing="1">
          <tr>
            <td height="32" colspan="2" align="center" bgcolor="#999999">用户登录</td>
          </tr>
          <tr style="background-color:#CCC">
            <td width="97" align="center"  style="text-align:right">用户名：</td>
            <td style="text-align:left"><input  width="120px" type="text" name="username" /></td>
          </tr>
          <tr style="background-color:#CCC">
            <td align="center" style="text-align:right">密&nbsp; 码：</td>
            <td style="text-align:left"><input width="150px" type="password" name="password" /></td>
          </tr>
          <tr>
            <td height="33" colspan="2" align="center" bgcolor="#999999"><input type="submit" name="button" id="button" value="提交">
              <input type="reset" name="button2" id="button2" value="重置"></td>
          </tr>
        </table>
        <p>&nbsp;</p>
</form>   
    <a href ="reg.jsp">用户注册</a>
    
  </body>
</html>
