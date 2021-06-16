package com.szykoz.druginteractions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/check-interaction")
public class InteractionController {

    @GetMapping("")
    ModelAndView getResponse() {
        ModelAndView model = new ModelAndView("drugs");
        return model;
    }


}
