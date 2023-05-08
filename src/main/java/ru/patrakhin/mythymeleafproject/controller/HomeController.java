package ru.patrakhin.mythymeleafproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        // здесь можно добавить данные для передачи на страницу, например:
        model.addAttribute("message", "Welcome to MyThymeleafProject!");
        return "home";
    }
}
