package com.szykoz.druginteractions.repository;

import com.szykoz.druginteractions.model.Drug;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DrugRepository extends Neo4jRepository<Drug, Long> {

    //@Query("MATCH (d:Drug)<-[r:INTERACTS]-(d2:Drug) return collect(DISTINCT d2) AS nodes")
    @Query("MATCH ()<-[r:INTERACTS]-(n:Drug) WITH collect(DISTINCT n) AS dr RETURN dr")
    List<Drug> getAllDrugs();

    @Query("MATCH (d:Drug)<-[r:INTERACTS]-(e:Drug {id: $rxcui}) return d,r")
    List<Drug> getAllInteractions(Long rxcui);

    @Override
    @Query("MATCH (d:Drug {id: $rxcui}) return d")
    Optional<Drug> findById(Long rxcui);
}
