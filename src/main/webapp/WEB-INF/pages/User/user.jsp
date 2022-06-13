<%--
  Created by IntelliJ IDEA.
  User: xmy
  Date: 13/06/2022
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String path = request.getContextPath();%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>用户页面</title>

    <link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=path%>/css/bootstrap-theme.css">

    <script src="<%=path%>/js/jquery-3.5.1.min.js"></script>
    <script src="<%=path%>/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-4" style="text-align: center">
            <div class="row">
                <div style="height: 100px;text-align: center;">
                    <p style="font-size: 30px;margin-top: 50px;">欢迎您！${login_user_}</p>
                </div>
                <div class="row">
                    <div class="col-md-6" style="text-align: right;">
                        <a href="<%=path%>/User/DisplayMyInfo"><button class="btn btn-info btn-lg" style="width: 150px;">个人资料</button></a>
                    </div>
                    <div class="col-md-6" style="text-align: left;">
                        <a href="<%=path%>/Login/LoginOut"><button class="btn btn-danger btn-lg" style="width: 150px;">退出登录</button></a>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-md-6" style="text-align: right;">
                        <a href="<%=path%>/User/FindOfAskQuestion"><button class="btn btn-info btn-lg" style="width: 150px;">提出的问题</button></a>
                    </div>
                    <div class="col-md-6" style="text-align: left;">
                        <a href="<%=path%>/Login/LoginOut"><button class="btn btn-danger btn-lg" style="width: 150px;">查看所有问题</button></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>