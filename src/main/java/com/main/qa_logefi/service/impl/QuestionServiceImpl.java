package com.main.qa_logefi.service.impl;

import com.main.qa_logefi.dao.QuestionDao;
import com.main.qa_logefi.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("questionService")
public class QuestionServiceImpl implements QuestionDao {

    @Autowired
    private QuestionDao questionDao;

    @Override
    public Question findQuestionById(Integer question_id) {
        return questionDao.findQuestionById(question_id);
    }

    @Override
    public List<Question> findAll() {
        return questionDao.findAll();
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
