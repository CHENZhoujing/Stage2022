package com.main.qa_logefi.controller;

import com.main.qa_logefi.entity.Question;
import com.main.qa_logefi.entity.User;
import com.main.qa_logefi.service.AnswerService;
import com.main.qa_logefi.service.QuestionService;
import com.main.qa_logefi.service.TaxDepartmentService;
import com.main.qa_logefi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class AdministratorController {

    @Autowired
    @Qualifier("answerService")
    private AnswerService answerService;

    @Autowired
    @Qualifier("questionService")
    private QuestionService questionService;

    @Autowired
    @Qualifier("taxDepartmentService")
    private TaxDepartmentService taxDepartmentService;

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    /**
     * 进入所有问题列表页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/DisplayAllQuestionList")
    public String DisplayAllQuestionList(Model model) {

        List<Question> questions = questionService.findAll(); //所有问题

        //查询提出该问题的用户信息
        List<User> users = new ArrayList<>();       //初始化用户列表
        for (int i=0;i<questions.size();i++) {
            User user = questionService.findUserByQuestionId(questions.get(i).getQuestion_id());  //得到提出该问题的用户信息
            users.add(user);        //将用户信息存入用户列表
        }
        Integer count = questionService.findTotal();    //总问题数
        String method = "DisplayAllQuestionList";       //判断由哪个控制器方法返回的jsp页面

        model.addAttribute("questions",questions);  //存入问题信息，等待前端使用
        model.addAttribute("users",users);          //存入用户信息，等待前端使用
        model.addAttribute("count",count);          //存入总问题数信息，等待前端使用
        model.addAttribute("method",method);        //存入跳转的该方法名，等待前端使用
        return "Question/questionList";                //返回问题列表页面
    }

    @RequestMapping(value = "/VerifyDeleteUser")
    public String VerifyDeleteUser() {
        return "User/verifyDeleteUser";
    }

    @RequestMapping(value = "DeleteUser")
    public String DeleteUser(HttpSession httpSession) {
        Integer user_id = (Integer) httpSession.getAttribute("login_user_id");
        userService.deleteUser(user_id);
        return "Login/login";
    }
}
