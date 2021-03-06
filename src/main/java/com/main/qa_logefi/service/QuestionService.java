package com.main.qa_logefi.service;

import com.main.qa_logefi.entity.Question;
import com.main.qa_logefi.entity.User;

import java.util.List;

public interface QuestionService {

    Question findQuestionById(Integer question_id);

    List<Question> findQuestionByUserId(Integer question_user_id);

    User findUserByQuestionId(Integer user_id);

    List<Question> findAll();

    Integer findTotal();

    void saveQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestion(Integer question_id);
}
