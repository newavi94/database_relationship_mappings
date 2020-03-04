package com.databaserelationship.dbrelationonetomany.resources.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "intern_details")
@Getter @Setter @NoArgsConstructor @ToString
public class InternDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("address")
    private String address;

    @JsonProperty("zip_code")
    private Integer zipCode;

    @OneToOne(mappedBy = "internDetails")
    @JsonIgnoreProperties("details")
    private Interns intern;

    public InternDetails(String address, Integer zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }
}