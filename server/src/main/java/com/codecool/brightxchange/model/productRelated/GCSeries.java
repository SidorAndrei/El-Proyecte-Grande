package com.codecool.brightxchange.model.productRelated;

import com.codecool.brightxchange.model.products.GraphicsCard;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@Entity(name = "GCSeries")
@Table(
        name = "gc_series",
        uniqueConstraints = {
                @UniqueConstraint(name = "gc_series_name_unique", columnNames = "name")
        }
)
public class GCSeries {
    @JsonProperty("gcSeriesId")
    @Id
    @SequenceGenerator(
            name = "gc_series_sequence",
            sequenceName = "gc_series_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "gc_series_sequence"
    )
    private int id;
    @JsonProperty("gcSeriesFamily")
    @ManyToOne
    @JoinColumn(
            name = "gc_family_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "gc_series_gc_family_fk"
            )
    )
    private GraphicsCardFamily family;
    @JsonProperty("gcSeriesName")
    @Column(
            name= "name",
            columnDefinition = "TEXT"
    )
    private String name;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<GraphicsCard> graphicsCards = new HashSet<>();

    public GCSeries(int id, GraphicsCardFamily family, String name) {
        this.id = id;
        this.family = family;
        this.name = name;
    }

    public GCSeries(int id, GraphicsCardFamily family, String name, Set<GraphicsCard> graphicsCards) {
        this.id = id;
        this.family = family;
        this.name = name;
        this.graphicsCards = graphicsCards;
    }
}
