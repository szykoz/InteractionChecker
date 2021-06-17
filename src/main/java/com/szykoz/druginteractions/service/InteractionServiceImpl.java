package com.szykoz.druginteractions.service;

import com.szykoz.druginteractions.model.Drug;
import com.szykoz.druginteractions.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final DrugRepository drugRepository;

    @Autowired
    public InteractionServiceImpl(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    @Override
    public List<Drug> getAllDrugs() {
        return drugRepository.getAllDrugs();
    }
}
