package com.main.qa_logefi.service.impl;

import com.main.qa_logefi.entity.Answer;
import com.main.qa_logefi.service.AnswerService;
import com.main.qa_logefi.dao.AnswerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    public List<Answer> findAnswerByUserId(Integer user_id) {

        return answerDao.findAnswerByUserId(user_id);
    }

    @Override
    public void saveAnswer(Answer answer) {

        answerDao.saveAnswer(answer);
    }

    @Override
    public void updateAnswer(Answer answer) {
        answerDao.updateAnswer(answer);
    }

    @Override
    public void deleteAnswer(Integer answer_id) {

        answerDao.deleteAnswer(answer_id);
    }
}
