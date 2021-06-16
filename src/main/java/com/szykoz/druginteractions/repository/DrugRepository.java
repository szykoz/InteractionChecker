package com.szykoz.druginteractions.repository;

import com.szykoz.druginteractions.model.Drug;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DrugRepository extends Neo4jRepository<Drug, Integer> {

}
