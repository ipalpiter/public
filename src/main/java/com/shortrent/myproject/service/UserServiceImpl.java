package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.UserDao;
import com.shortrent.myproject.generator.model.User;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void deleteUser(Integer usrId) {
        userDao.deleteByPrimaryKey(usrId);
    }

    @Override
    public User getUser(Integer usrId) {
        return userDao.selectByPrimaryKey(usrId);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> getAll() {
        List<User> users=userDao.selectByExample(null);
        return users;
    }
}
