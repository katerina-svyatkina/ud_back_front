package org.example.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.transform.Result;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@Table(name="resultsofanalyses")
@NoArgsConstructor
@AllArgsConstructor
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer   id_results;

    @Column(name = "dateofresults")
    private LocalDateTime dateofresults;

    @Column(name = "dateofcollection")
    private LocalDateTime   dateofcollection;

    @Column(name = "cooment")
    private String   comment;

    @Column(name = "standart")
    private Boolean   standart;

    @Column(name = "result")
    private String   result;

    @ManyToOne(
        targetEntity = Results.class,
            cascade = CascadeType.MERGE
   )
    @JoinColumn(name="id_appointment")
    private Results results;

}
