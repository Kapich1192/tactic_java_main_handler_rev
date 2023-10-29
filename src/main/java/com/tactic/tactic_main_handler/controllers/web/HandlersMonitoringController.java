package com.tactic.tactic_main_handler.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HandlersMonitoringController {

    @GetMapping("/handlers_monitoring")
    public String getHandlersMonitoring() {

        return "handlers_monitoring";
    }
}
