package org.example.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name="medicines")
@NoArgsConstructor
@AllArgsConstructor
public class Medicines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer   id_medicines;

    @Column(name = "date")
    private String date;

    @Column(name = "allmedicines")
    private String   allmedicines;

    @Column(name = "name")
    private String   name;

    @Column(name = "cost")
    private Integer   cost;

    @Column(name = "availability")
    private Boolean   availability;

    @Column(name = "byprescription")
    private Boolean   byprescription;

    @Column(name = "country")
    private String   country;



}
