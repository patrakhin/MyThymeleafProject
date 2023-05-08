package ru.patrakhin.mythymeleafproject.service;

import ru.patrakhin.mythymeleafproject.model.User;

public interface UserService {
    User createUser(String username, String password);
    User findByUsername(String username);
    User findById(Long id);
}
