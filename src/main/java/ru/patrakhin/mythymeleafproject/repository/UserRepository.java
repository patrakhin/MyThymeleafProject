package ru.patrakhin.mythymeleafproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.patrakhin.mythymeleafproject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}