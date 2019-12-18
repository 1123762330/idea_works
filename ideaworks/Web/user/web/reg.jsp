<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reg.jsp' starting page</title>
    
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
    <form method="post" action="/users/regeistServlet">
        <p>&nbsp;</p>
      <table width="433" height="123" border="0" align="center" cellpadding="0" cellspacing="1">
        <tr>
          <td height="32" colspan="3" align="center" bgcolor="#FF9933">用户注册</td>
        </tr>
       
       
        <tr>
          <td width="97" align="center" bgcolor="#FFC993">用户名：</td>
          <td width="189" bgcolor="#FFC993"><input type="text" name="username" /></td>
          <td width="143" bgcolor="#FFC993">&nbsp;</td>
        </tr>
        <tr>
          <td align="center" bgcolor="#FFC993">密码：</td>
          <td bgcolor="#FFC993"><input type="password" name="password" /></td>
          <td align="center" bgcolor="#FFC993">&nbsp;</td>
        </tr>
        <tr>
          <td colspan="3" align="center" bgcolor="#FF9933"><input type="submit" name="button" id="button" value="提交">
          <input type="reset" name="button2" id="button2" value="重置"></td>
        </tr>
      </table>
  </form>  
    <br>
    jsp = html + java
    <br>
            
    <%
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd ");       
       out.println(sdf.format(new Date()));    
     %>
    
    
  </body>
</html>
