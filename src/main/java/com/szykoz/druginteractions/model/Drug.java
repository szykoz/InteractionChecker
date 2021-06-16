package com.szykoz.druginteractions.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("drug")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drug {
    @Id
    Integer id;
    String name;
}
