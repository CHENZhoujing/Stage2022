package com.main.qa_logefi.service.impl;

import com.main.qa_logefi.dao.UserDao;
import com.main.qa_logefi.entity.Answer;
import com.main.qa_logefi.entity.Question;
import com.main.qa_logefi.entity.User;
import com.main.qa_logefi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String user_name) {
        return userDao.findUserByName(user_name);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<Question> findAllOfAskQuestion(Integer user_id) {
        return userDao.findAllOfAskQuestion(user_id);
    }

    @Override
    public List<Answer> findAllOfMakeAnswer(Integer user_id) {
        return userDao.findAllOfMakeAnswer(user_id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer user_id) {
        userDao.deleteUser(user_id);
    }
}
