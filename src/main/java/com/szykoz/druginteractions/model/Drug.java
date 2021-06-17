package com.szykoz.druginteractions.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Drug")
public class Drug {
    @Id
    private Long id;
    private String name;
    @Relationship(type = "INTERACTS", direction = Relationship.Direction.INCOMING)
    private List<Drug> interactionList = new ArrayList<>();
}
