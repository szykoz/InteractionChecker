package com.szykoz.druginteractions.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RelationshipProperties
public class Interaction {

    private List<String> how;

    @TargetNode
    private Drug drug;

}
