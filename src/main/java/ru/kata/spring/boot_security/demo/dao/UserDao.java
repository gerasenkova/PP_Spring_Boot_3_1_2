package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    User findByUsername(String username);
    List<User> userList();
    void saveUser(User user);
    void updateUser (User user);
    void delete(long id);
    User getById(long id);
}
