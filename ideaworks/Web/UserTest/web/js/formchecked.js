window.onload = function(){
    //分别绑定离焦事件
    document.getElementById("name").onblur = checkUsername;
    document.getElementById("age").onblur = checkAge;
    document.getElementById("email").onblur = checkEmail;
    document.getElementById("qq").onblur = checkQq;
}

//校验用户名
function checkUsername(){
    //1.获取用户名的值
    var username = document.getElementById("name").value;
    //2.定义正则表达式
    var reg_username = /^\w{3,12}$/;
    //3.判断值是否符合正则的规则
    var flag = reg_username.test(username);
    //4.提示信息
    var s_username = document.getElementById("s_username");

    if(flag){
        //提示绿色对勾
        s_username.innerHTML = "正确";
    }else{
        //提示红色用户名有误
        s_username.innerHTML = "用户名格式有误";
    }
    return flag;
}

//校验年龄
function checkAge(){
    //1.获取用户名的值
    var age = document.getElementById("age").value;
    //2.定义正则表达式
    var reg_age = /^\w{1,2}$/;
    //3.判断值是否符合正则的规则
    var flag = reg_age.test(age);
    //4.提示信息
    var s_userage = document.getElementById("s_userage");

    if(flag){
        //提示绿色对勾
        s_userage.innerHTML = "正确";
    }else{
        //提示红色用户名有误
        s_userage.innerHTML = "年龄不符合";
    }
    return flag;
}

//校验邮箱
function checkEmail(){
    //1.获取用户名的值
    var email = document.getElementById("email").value;
    //2.定义正则表达式
    var reg_email = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})$/;
    //3.判断值是否符合正则的规则
    var flag = reg_email.test(email);
    //4.提示信息
    var s_email = document.getElementById("s_email");

    if(flag){
        //提示绿色对勾
        s_email.innerHTML = "正确";
    }else{
        //提示红色用户名有误
        s_email.innerHTML = "邮箱格式有误";
    }
    return flag;
}

//校验QQ
function checkQq(){
    //1.获取用户名的值
    var qq = document.getElementById("qq").value;
    //2.定义正则表达式
    var reg_qq = /^\w{6,10}$/;
    //3.判断值是否符合正则的规则
    var flag = reg_qq.test(qq);
    //4.提示信息
    var s_username = document.getElementById("s_qq");

    if(flag){
        //提示绿色对勾
        s_username.innerHTML = "正确";
    }else{
        //提示红色用户名有误
        s_username.innerHTML = "QQ格式有误";
    }
    return flag;
}