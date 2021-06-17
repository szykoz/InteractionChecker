package com.szykoz.druginteractions.service;

import com.szykoz.druginteractions.model.Drug;

import java.util.List;
import java.util.Optional;

public interface InteractionService {

    List<Drug> getAllDrugs();

    List<Drug> getAllInteractions(Long rxcui);

    Optional<Drug> findById(Long id);
}
