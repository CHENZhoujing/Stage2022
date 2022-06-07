package com.main.qa_logefi.service;

import com.main.qa_logefi.entity.Question;

import java.util.List;

public interface QuestionService {

    Question findQuestionById(Integer question_id);

    List<Question> findAll();

    void saveQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestion(Integer question_id);
}
