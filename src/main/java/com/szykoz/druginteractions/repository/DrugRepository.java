package com.szykoz.druginteractions.repository;

import com.szykoz.druginteractions.model.Drug;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugRepository extends Neo4jRepository<Drug, Long> {

    //@Query("MATCH (d:Drug)<-[r:INTERACTS]-(d2:Drug) return collect(DISTINCT d2) AS nodes")
    @Query("MATCH ()<-[r:INTERACTS]-(n:Drug) WITH collect(DISTINCT n) AS __sn__ RETURN __sn__")
    List<Drug> getAllDrugs();
}
