package ru.khlestkov.spring.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.khlestkov.spring.SpringBoot.dao.UserDao;
import ru.khlestkov.spring.SpringBoot.model.User;


import java.util.List;

@Service
public class UserServicelmpl implements UserService {
    public UserDao userDao;

    @Autowired
    public UserServicelmpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void removeUser(long id) {
        userDao.removeUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }
}
