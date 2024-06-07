package org.example.hospital.entity;


import jakarta.persistence.*;
import lombok.*;
import org.example.hospital.compositepk.AnalysesOfAppointmentPk;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "analysesofappointment")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class AnalysesOfAppointment {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private AnalysesOfAppointmentPk pk;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "sale")
    private Long sale;

    @Column(name = "cost")
    private Integer cost;

}
