package ru.patrakhin.mythymeleafproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.patrakhin.mythymeleafproject.model.User;
import ru.patrakhin.mythymeleafproject.service.UserService;

@Controller
public class RegistrationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               Model model) {

        LOGGER.info("Received request to register user with username: {}", username);

        User existingUser = userService.findByUsername(username);

        if (existingUser != null) {
            LOGGER.warn("User with username {} already exists", username);
            model.addAttribute("errorMessage", "User with such username already exists");
            return "registration";
        } else {
            User newUser = userService.createUser(username, password);
            LOGGER.info("User registered with id: {}", newUser.getId());
            return "redirect:/login";
        }
    }
}