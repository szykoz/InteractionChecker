package com.szykoz.druginteractions.controller;

import com.szykoz.druginteractions.model.Drug;
import com.szykoz.druginteractions.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

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
        model.addObject("drugList", interactionService.getAllDrugs());
        return model;
    }

    @GetMapping("/check")
    ModelAndView getInteractions(@RequestParam(name = "rxcui") Long rxcui) {
        ModelAndView model = new ModelAndView("interactions");
        Optional<Drug> drugOptional = interactionService.findById(rxcui);
        if(drugOptional.isPresent()) {
            model.addObject("drug", drugOptional.get());
        }
        return model;

    }
}
