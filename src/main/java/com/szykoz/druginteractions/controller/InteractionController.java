package com.szykoz.druginteractions.controller;

import com.szykoz.druginteractions.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/drugs")
public class InteractionController {

    private final InteractionService interactionService;

    @Autowired
    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @GetMapping("")
    ModelAndView getResponse() {
        ModelAndView model = new ModelAndView("index");
        //System.err.println(interactionService.getAllDrugs());
        model.addObject("drugList", interactionService.getAllDrugs());
        return model;
    }

    @GetMapping("/check")
    ModelAndView getInteractions(@RequestParam(name = "rxcui") Long id) {
        ModelAndView model = new ModelAndView("interactions");
        System.err.println(interactionService.getAllInteractions(id));
        model.addObject("drug", interactionService.findById(id).get());
        model.addObject("interactionList", interactionService.getAllInteractions(id));

        return model;

    }


}
