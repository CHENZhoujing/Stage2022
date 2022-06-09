package com.main.qa_logefi.service.impl;

import com.main.qa_logefi.dao.QuestionDao;
import com.main.qa_logefi.dao.UserDao;
import com.main.qa_logefi.entity.Question;
import com.main.qa_logefi.entity.User;
import com.main.qa_logefi.service.QuestionService;
import com.main.qa_logefi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Autowired
    private UserDao userDao;

    @Override
    public Question findQuestionById(Integer question_id) {
        return questionDao.findQuestionById(question_id);
    }

    public List<Question> findQuestionByUserId(Integer question_user_id) {
        return  questionDao.findQuestionByUserId(question_user_id);
    }

    public User findUserByQuestionId(Integer question_id) {
        Question question = questionDao.findQuestionById(question_id);
        Integer user_id = question.getQuestion_user_id();
        return userDao.findUserById(question_id);
    }

    @Override
    public List<Question> findAll() {
        return questionDao.findAll();
    }

    public Integer findTotal() {
        return questionDao.findTotal();
    }
    @Override
    public void saveQuestion(Question question) {
        questionDao.saveQuestion(question);
    }

    @Override
    public void updateQuestion(Question question) {
        questionDao.updateQuestion(question);
    }

    @Override
    public void deleteQuestion(Integer question_id) {
        questionDao.deleteQuestion(question_id);
    }
}
