package org.example.hospital.compositepk;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hospital.entity.Appointment;
import org.example.hospital.entity.Medicines;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class MedicinesOfAppointmentPk implements Serializable {

    @ManyToOne(
            targetEntity = Medicines.class,
            cascade = CascadeType.MERGE
    )
    @JoinColumn(name = "id_medicines")
    private Medicines medicines;

    @ManyToOne(
            targetEntity = Appointment.class,
            cascade = CascadeType.MERGE
    )
    @JoinColumn(name = "id_appointment")
    private Appointment appointment;
}
