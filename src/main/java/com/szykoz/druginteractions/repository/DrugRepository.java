package com.szykoz.druginteractions.repository;

import com.szykoz.druginteractions.model.Drug;
import com.szykoz.druginteractions.model.Interacts;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DrugRepository extends Neo4jRepository<Drug, Long> {


    @Query("MATCH ()<-[r:INTERACTS]-(n:Drug) WITH collect(DISTINCT n) AS dr RETURN dr")
    List<Drug> getAllDrugs();


    @Override
    @Query("MATCH (d:Drug)<-[r:INTERACTS]-(e:Drug{rxcui: $rxcui}) return e, collect(r),collect(d)")
    Optional<Drug> findById(Long rxcui);

}
