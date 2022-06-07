package com.main.qa_logefi.dao;

import com.main.qa_logefi.entity.Answer;
import com.main.qa_logefi.entity.Question;
import org.springframework.stereotype.Repository;
import com.main.qa_logefi.entity.User;

import java.util.List;

/**
 * 持久层 用户接口
 */
@Repository("userDao")
public interface UserDao {


    /**
     * 根据用户名查询用户
     * 用于用户登录
     * @param user_name
     * @return
     */
    User findUserByName(String user_name);

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 查询某用户提出的所有问题（传入用户编号）
     * @param user_id
     * @return
     */
    List<Question> findAllOfAskQuestion(Integer user_id);

    /**
     * 查询某用户做出的所有回答（传入用户编号）
     * @param user_id
     * @return
     */
    List<Answer> findAllOfMakeAnswer(Integer user_id);

    /**
     * 新增用户
     * 用户名、代理名、用户密码、用户状态为必填项
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * 用户编号、用户名、代理名、用户密码、用户状态为必填项
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据ID删除用户
     * @param user_id
     */
    void deleteUser(Integer user_id);
}
