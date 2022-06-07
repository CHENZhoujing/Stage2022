package com.main.qa_logefi.service;

import com.main.qa_logefi.entity.Answer;
import com.main.qa_logefi.entity.Question;
import com.main.qa_logefi.entity.User;

import java.util.List;

public interface UserService {

    User findUserByName(String user_name);

    List<User> findAll();

    List<Question> findAllOfAskQuestion(Integer user_id);

    List<Answer> findAllOfMakeAnswer(Integer user_id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer user_id);
}
