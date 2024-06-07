package org.example.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.example.hospital.compositepk.AnalysesOfAppointmentPk;
import org.example.hospital.compositepk.MedicinesOfAppointmentPk;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="medicinesofappointment")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicinesOfAppointment {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private MedicinesOfAppointmentPk pk;

    @Column(name = "quantity")
    private  Integer quantity;

    @Column(name = "allcost")
    private Integer allcost;


}
