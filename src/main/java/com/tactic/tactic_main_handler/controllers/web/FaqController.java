package com.tactic.tactic_main_handler.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.tactic.tactic_main_handler.config.Singleton.thisElement;

@Controller
public class FaqController {
    @GetMapping("/faq")
    public String getFaq() {
        return "faq";
    }
}
