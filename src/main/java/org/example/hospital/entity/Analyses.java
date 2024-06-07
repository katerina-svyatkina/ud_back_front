package org.example.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@Table(name="analyses")
@NoArgsConstructor
@AllArgsConstructor
public class Analyses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer   id_analyses;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String   description;

    @Column(name = "omsornot")
    private Boolean   omsornot;

    @Column(name = "cost")
    private String   cost;

}
