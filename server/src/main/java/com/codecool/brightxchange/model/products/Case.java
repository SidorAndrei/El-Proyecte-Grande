package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.productTypes.CaseType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "Case")
@Table(name = "case")
public class Case{
    @JsonProperty("caseId")
    @Id
    @SequenceGenerator(
            name = "case_sequence",
            sequenceName = "case_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "case_sequence"
    )
    private Long id;

    @JsonProperty("productPrice")
    protected float price;

    @JsonProperty("productCurrency")
    protected PriceCurrency currency;

    @JsonProperty("productQuantity")
    protected Integer quantity;

    @JsonProperty("productSupplier")
    @ManyToOne
    @JoinColumn(
            name = "supplier_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "case_supplier_fk"
            )
    )
    private Supplier supplier;

    @JsonProperty("caseProducer")
    @ManyToOne
    @JoinColumn(
            name = "case_producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "case_case_producer_fk"
            )
    )
    private CaseProducer caseProducer;

    @JsonProperty("caseModel")
    @Column(   
            name =  "model",
            columnDefinition = "TEXT"
    )
    private String model;

    @JsonProperty("caseType")
    @ManyToOne
    @JoinColumn(
            name = "case_type_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "case_case_type_fk"
            )
    )
    private CaseType caseType;

    @JsonProperty("caseNumberOfHDD")
    @Column(name = "number_of_hdd")
    private Integer numberOfHDD;

    @JsonProperty("caseNumberOfSSD")
    @Column(name = "number_of_ssd")
    private Integer numberOfSSD;

    public Case(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, CaseProducer caseProducer, String model, CaseType caseType, Integer numberOfHDD, Integer numberOfSSD) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.caseProducer = caseProducer;
        this.model = model;
        this.caseType = caseType;
        this.numberOfHDD = numberOfHDD;
        this.numberOfSSD = numberOfSSD;
    }
}
