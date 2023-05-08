package ru.patrakhin.mythymeleafproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactController.class);

    @GetMapping("/contact")
    public String contact(Model model){
        LOGGER.info("Contact page visited");
        return "contact";
    }
}
