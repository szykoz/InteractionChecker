package com.szykoz.druginteractions.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;


@Data
@AllArgsConstructor
@RelationshipProperties
public class Interacts {

    @Id
    @GeneratedValue
    private Long graphId;

    private final String how;

    @TargetNode
    private final Drug drug;

}
