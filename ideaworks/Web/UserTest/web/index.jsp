<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>管理员登录</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript"></script>
    <script>
        window.onload = function () {
            document.getElementById("vcode").onclick = function () {
                this.src = "${pageContext.request.contextPath}/checkCodeServlet?time=" + new Date().getTime();
            }
        }
    </script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">管理员登录</h3>
    <form action="${pageContext.request.contextPath}/loginServlet" method="post">
        <div class="form-group">
            <label for="username">用户名：</label>
            <input type="text" name="username" class="form-control" id="username" placeholder="请输入用户名"/>
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码"/>
        </div>
        <div class="form-inline">
            <label for="vcode">验证码：</label>
            <input type="text" name="checkCode" class="form-control" id="checkCode" placeholder="请输入验证码"
                   style="width: 120px;"/>
            <img id="vcode" src="${pageContext.request.contextPath}/checkCodeServlet">
        </div>
        <hr/>
        <div class="form-group" style="text-align: center;">
            <input class="btn btn btn-primary" type="submit" value="登录">
            <a href="register.jsp"><input class="btn btn btn-primary" type="button" value="注册"
                                          style="margin-left: 30px"></a>
        </div>
    </form>
    <!-- 出错显示的信息框 -->
    ${login_msg}
</div>
</body>
</html>