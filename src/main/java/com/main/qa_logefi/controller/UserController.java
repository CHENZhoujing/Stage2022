package com.main.qa_logefi.controller;

import com.main.qa_logefi.entity.Question;
import com.main.qa_logefi.service.AnswerService;
import com.main.qa_logefi.service.QuestionService;
import com.main.qa_logefi.service.TaxDepartmentService;
import com.main.qa_logefi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * 表现层 用户
 */
@Controller
@RequestMapping(value = "/User")
public class UserController {

    @Autowired
    @Qualifier("questionService")
    private QuestionService questionService;

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/AskQuestion")
    public String AskQuestion() {
        return "Question/askQuestion";
    }

    @RequestMapping("/DeleteQuestion")
    public @ResponseBody Boolean DeleteQuestion(@RequestBody Map<String,String> map) {
        //要删除的问题编号
        Integer question_id = Integer.parseInt(map.get("question_id"));
        //在数据库中删除问题
        questionService.deleteQuestion(question_id);
        return true;
    }

    @RequestMapping(value = "/FindOfAskQuestion")
    public String FindOfToQuestion(HttpSession httpSession, Model model) {
        Integer user_id = (Integer) httpSession.getAttribute("login_user_id");
        List<Question> questions = questionService.findQuestionByUserId(user_id);
        model.addAttribute("questions", questions);
        String method = "FindOfAskQuestion";
        model.addAttribute("method", method);
        return "User/userListQuestion";
    }


    @RequestMapping(value = "/VerifyDeleteUser")
    public String VerifyDeleteUser() {
        return "User/verifyDeleteUser";
    }

    @RequestMapping(value = "/DeleteUser")
    public String DeleteUser(HttpSession httpSession) {
        Integer user_id = (Integer) httpSession.getAttribute("login_user_id");
        userService.deleteUser(user_id);
        return "Login/login";
    }
}
