<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="cn.itheima.dao.UserDao" %>
<%@ page import="cn.itheima.domain.User" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>所有用户信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <style>
      table {
      width: 40%;
      border: solid 1px;
      margin: auto;
      }

      td, th {
      text-align: center;
      border: solid 1px;
      }

      div {
      text-align: center;
      margin: 50px;
      }

      .out{
      background-color: #ffffff;
      }
      .over{
      background-color: #FFD026;
      }
      </style>

  </head>
  <%
      List<User> list = new UserDao().getAllUser();
      Iterator it = list.iterator();
   %>
  <body>
  <form method="post" action="/users/updateServlet">
      <div>
          <input type="text" id="id" placeholder="请输入编号">
          <input type="text" id="username" placeholder="请输入姓名">
          <input type="text" id="password" placeholder="请输入密码">
          <input type="button" value="查找" id="btn_search">
      </div>
      <table>
          <caption>学生信息表</caption>
          <tr>
              <th><input type="checkbox" name="cb" id="checkboxone"></th>
              <th>ID</th>
              <th>用户名</th>
              <th>密码</th>
              <th>操作</th>
          </tr>

          <%-- 循环it对象，获取所有的用户信息 --%>
          <%
              while(it.hasNext()){
                  User user = (User) it.next();
          %>

          <tr>
              <td><input type="checkbox" name="cb"></td>
              <td><%= user.getUserId() %></td>
              <td><%=user.getUserName() %></td>
              <td><%= user.getPassword()%></td>
              <td>
                  <a href="delUserServlet?userid=<%= user.getUserId() %>">删除</a>
                  <a href="update.jsp">修改</a>
              </td>
          </tr>
          <%}%>
      </table>

      <div>
          <input type="button" id="checkAll" value="全选">
          <input type="button" id="notcheck" value="全不选">
          <input type="button" id="checks" value="反选">
      </div>
  </form>

  <script>
      /*实现添加功能*/
      document.getElementById("btn_search").onclick = function () {
          var id = document.getElementById("id").value;
          var username = document.getElementById("username").value;
          var password = document.getElementById("password").value;
          //获取表格
          var table = document.getElementsByTagName("table")[0];
          //追加一行
          table.innerHTML +="<tr>\n" +
              "        <td><input type=\"checkbox\" name=\"cb\"></td>\n" +
              "        <td>"+id+"</td>\n" +
              "        <td>"+username+"</td>\n" +
              "        <td>"+password+"</td>\n" +
              "        <td><a href=\"javascript:void(0);\" onclick=\"delTr(this);\">删除</a>" +
              "             <a href=\"update.jsp\">修改</a></td>\n" +
              "    </tr>"
      }

      /*实现删除功能*/
      function delTr(obj) {
          var table = obj.parentNode.parentNode.parentNode;
          var tr = obj.parentNode.parentNode;
          table.removeChild(tr);
      }

      /*实现全选功能*/
      //2.给全选按钮绑定单击事件
      document.getElementById("checkAll").onclick = function () {
          //全选
          //1.获取所有的checkbox
          var cbs = document.getElementsByName("cb");
          //2.遍历
          for (var i = 0; i < cbs.length; i++) {
              //3.设置每一个cb的状态为选中  checked
              cbs[i].checked = true;
          }
      }

      /*实现全不选功能*/
      document.getElementById("notcheck").onclick = function(){
          //全不选
          //1.获取所有的checkbox
          var cbs = document.getElementsByName("cb");
          //2.遍历
          for (var i = 0; i < cbs.length; i++) {
              //3.设置每一个cb的状态为未选中  checked
              cbs[i].checked = false;
          }
      }

      /*实现第一个总按钮功能*/
      document.getElementById("checkboxone").onclick = function(){
          //第一个cb点击
          //1.获取所有的checkbox
          var cbs = document.getElementsByName("cb");
          //获取第一个cb

          //2.遍历
          for (var i = 0; i < cbs.length; i++) {
              //3.设置每一个cb的状态和第一个cb的状态一样
              cbs[i].checked =  this.checked;
          }
      }

      /*实现反选功能*/
      document.getElementById("checks").onclick = function(){
          //反选
          //1.获取所有的checkbox
          var cbs = document.getElementsByName("cb");
          //2.遍历
          for (var i = 0; i < cbs.length; i++) {
              //3.设置每一个cb的状态为相反
              cbs[i].checked = !cbs[i].checked;
          }
      }

      /*实现选择行功能*/
      var trs= document.getElementsByTagName("tr");
      for(var i=0;i<trs.length;i++){
          trs[i].onmouseover=function(){
              this.className="over";
          }

          trs[i].onmouseout=function(){
              this.className="out";
          }
      }
  </script>
  </body>
</html>
