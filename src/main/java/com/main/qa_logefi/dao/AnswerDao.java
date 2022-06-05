package com.main.qa_logefi.dao;

import com.main.qa_logefi.entity.Answer;
import com.main.qa_logefi.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层 回答接口
 */
@Repository("answerDao")
public interface AnswerDao {

    /**
     * 根据用户编号查询回答
     * @param user_id
     * @return
     */
    List<Answer> findAnswerByUserId(Integer user_id);

    /**
     * 根据问题编号查询回答
     * @param question_id
     * @return
     */
    List<Answer> findAnswerByQuestionId(Integer question_id);


    /**
     * 新增回答
     * 回答者用户编号、回答所对应的问题编号为必填项
     * @param answer
     */
    void saveAnswer(Answer answer);

    /**
     * 更新回答
     * 回答编号、回答者用户编号、回答所对应的问题编号为必填项
     * @param answer
     */
    void updateAnswer(Answer answer);

    /**
     * 根据ID删除回答
     * @param answer_id
     */
    void deleteAnswer(Integer answer_id);
}
