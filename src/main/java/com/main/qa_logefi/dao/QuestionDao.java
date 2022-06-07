package com.main.qa_logefi.dao;

import com.main.qa_logefi.entity.Answer;
import com.main.qa_logefi.entity.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层 问题接口
 */
@Repository("questionDao")
public interface QuestionDao {

    /**
     * 根据问题编号查询问题
     * @param question_id
     */
    Question findQuestionById(Integer question_id);

    /**
     * 查询所有问题
     * @return
     */
    List<Question> findAll();

    /**
     * 新增问题
     * 问题的提问者用户编号、问题状态为必填项
     * @param question
     */
    void saveQuestion(Question question);

    /**
     * 更新问题
     * 问题编号、问题的提问者用户编号、问题状态为必填项
     * @param question
     */
    void updateQuestion(Question question);

    /**
     * 根据问题编号删除问题
     * @param question_id
     */
    void deleteQuestion(Integer question_id);
}