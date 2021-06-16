package com.szykoz.druginteractions.controller;

import com.szykoz.druginteractions.model.Drug;
import com.szykoz.druginteractions.repository.DrugRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/drugs")
@AllArgsConstructor
public class DrugController {
    private final DrugRepository drugRepository;


    @GetMapping("/add")
    void addDrug() {
        drugRepository.save(new Drug(1,"name"));
    }

}
