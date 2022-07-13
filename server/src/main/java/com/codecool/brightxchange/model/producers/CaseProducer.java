package com.codecool.brightxchange.model.producers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "CaseProducer")
@Table(
        name = "case_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class CaseProducer{
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "case_producer_sequence",
            sequenceName = "case_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "case_producer_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @JsonProperty("name")
    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;

    public CaseProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
