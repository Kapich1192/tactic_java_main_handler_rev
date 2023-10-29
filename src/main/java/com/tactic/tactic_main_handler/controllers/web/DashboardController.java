package com.tactic.tactic_main_handler.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.tactic.tactic_main_handler.config.Singleton.thisElement;

@Controller
public class DashboardController {
    private String title = "Рабочая панель";
    private String description = "";
    private String htmlTemplate = "dashboard";
    private String htmlWarning = "warning";
    @GetMapping("/")
    public String getDashboard(Model model) {
        if(thisElement != null) {
            model.addAttribute("title",title);
            model.addAttribute("description",description);
            model.addAttribute("el",thisElement);
        }
        return htmlTemplate;
    }
}
