package com.szykoz.druginteractions.controller;

import com.szykoz.druginteractions.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/check-interaction")
public class InteractionController {

    private final InteractionService interactionService;

    @Autowired
    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @GetMapping("")
    ModelAndView getResponse() {
        ModelAndView model = new ModelAndView("drugs");
        //System.err.println(interactionService.getAllDrugs());
        model.addObject("drugList", interactionService.getAllDrugs());
        return model;
    }


}
