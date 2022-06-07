package com.main.qa_logefi.service;

import com.main.qa_logefi.entity.Answer;

import java.util.List;

/**
 * 业务层 回答服务接口
 */
public interface AnswerService {

    List<Answer> findAnswerByUserId(Integer user_id);

    void saveAnswer(Answer answer);

    void updateAnswer(Answer answer);

    void deleteAnswer(Integer answer_id);
}
