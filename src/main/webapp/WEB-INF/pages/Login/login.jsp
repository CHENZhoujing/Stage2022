<%--
  Created by IntelliJ IDEA.
  User: xmy
  Date: 12/06/2022
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <link rel="stylesheet" href="<%=path%>/assets/css/theme.css">
    <title>登录界面</title>
</head>

<body class="bg-light">
<!-- container -->
<div class="container d-flex flex-column">
    <div class="row align-items-center justify-content-center g-0
        min-vh-100">
        <div class="col-12 col-md-8 col-lg-6 col-xxl-4 py-8 py-xl-0">
            <!-- Card -->
            <div class="card smooth-shadow-md">
                <!-- Card body -->
                <div class="card-body p-6">
                    <div class="mb-4">
                        <a href="<%=path%>index.html"><img src="<%=path%>assets/images/brand/logo/logo-primary.svg"
                                                           class="mb-2" alt=""></a>
                        <p class="mb-6">请输入你的信息</p>
                    </div>
                    <!-- Form -->
                    <form action="<%=path%>/Login/User" name="loginform" method="post">
                        <!-- Username -->
                        <div class="mb-3">
                            <label for="user_name" class="form-label">用户名</label>
                            <input type="text" id="user_name" class="form-control" name="user_name" placeholder="在这里输入用户名"
                                   required="">
                        </div>
                        <!-- Password -->
                        <div class="mb-3">
                            <label for="user_password" class="form-label">密码</label>
                            <input type="password" id="user_password" class="form-control" name="user_password"
                                   placeholder="**************" required="">
                        </div>
                        <!-- Checkbox -->
                        <div class="d-lg-flex justify-content-between align-items-center mb-4">
                            <div class="form-check custom-checkbox">
                                <input type="checkbox" class="form-check-input" id="rememberme">
                                <label class="form-check-label" for="rememberme">保持登录状态</label>
                            </div>
                        </div>
                        <div>
                            <!-- Button -->
                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">登录</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Scripts -->
@@include("../partials/scripts.html")
</body>

</html>
