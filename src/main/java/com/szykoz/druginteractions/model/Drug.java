package com.szykoz.druginteractions.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Drug")
public class Drug {

    @Id
    @Property(name="rxcui")
    private Long rxcui;

    @Property(name = "name")
    private String name;

    @Relationship(type = "INTERACTS", direction = Relationship.Direction.OUTGOING)
    private List<Interacts> interactionList;

    @Relationship(type="INTERACTS", direction = Relationship.Direction.OUTGOING)
    private List<Drug> drugsList = new ArrayList<>();
}
