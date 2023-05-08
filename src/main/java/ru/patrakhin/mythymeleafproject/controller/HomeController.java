package ru.patrakhin.mythymeleafproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/")
    public String home(Model model) {
        LOGGER.info("Home page visited");
        // здесь можно добавить данные для передачи на страницу, например:
        model.addAttribute("message", "Welcome to MyThymeleafProject!");
        return "home";
    }
}
