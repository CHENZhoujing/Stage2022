package com.main.qa_logefi.controller;

import com.main.qa_logefi.entity.User;
import com.main.qa_logefi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 表现层 用户登录
 */
@Controller
@RequestMapping(value = "/Login")
public class LoginController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "LoginOut")
    public String loginOut(HttpSession httpSession) {
        httpSession.invalidate();
        return "Login/login";
    }

    @RequestMapping(value = "LoginPage")
    public String ReturnLogin() {
        return "Login/login";
    }


    @RequestMapping(value = "/User", method = {RequestMethod.POST})
    public String UserLogin(String user_name, String user_password, Model model, HttpServletRequest request) {
        //根据用户名查询用户信息
        //User database_user = userService.findUserByName(user_name);
        User database_user = null;

        //如果用户名与用户密码输入正确，则需要保存用户的编号和昵称信息
        if (database_user != null) {
            //用户编号
            Integer database_user_id = database_user.getUser_id();
            //用户名
            String database_user_name = database_user.getUser_name();
            //用户密码
            String database_user_password = database_user.getUser_password();
            //用户状态
            Integer database_user_status = database_user.getUser_status();

            //用户名与用户密码与数据库内匹配
            if (user_name.equals(database_user_name) && user_password.equals(database_user_password)) {
                switch (database_user_status) {
                    case 0 -> {
                        HttpSession httpSession = request.getSession(true); //存在session则使用，不存在则新创建
                        httpSession.setAttribute("login_user_id", database_user_id);    //将数据库返回的用户编号存入session中
                        httpSession.setAttribute("login_user_name", database_user_name);  //将数据库返回的用户名称存入session中
                        return "Administrator/administrator";
                    }
                    case 1 -> {
                        HttpSession httpSession = request.getSession(true); //存在session则使用，不存在则新创建
                        httpSession.setAttribute("login_user_id", database_user_id);    //将数据库返回的用户编号存入session中
                        httpSession.setAttribute("login_user_name", database_user_name);  //将数据库返回的用户名称存入session中
                        return "User/user";
                    }
                    default -> {
                        String msg = "用户被禁用";
                        model.addAttribute("msg", msg);
                        return "Login/loginFail";
                    }
                }
            } else {
                String msg = "用户密码错误";
                model.addAttribute("msg", msg);
                return "Login/loginFail";
            }
        } else {
            String msg = "用户不存在";
            model.addAttribute("msg", msg);
            return "Login/loginFail";
        }
    }

}
