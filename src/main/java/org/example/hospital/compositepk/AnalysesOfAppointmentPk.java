package org.example.hospital.compositepk;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hospital.entity.Analyses;
import org.example.hospital.entity.Appointment;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class AnalysesOfAppointmentPk implements Serializable {

    @ManyToOne(
            targetEntity = Analyses.class,
            cascade = CascadeType.MERGE
    )
    @JoinColumn(name = "id_analyses")
    private Analyses analyses;

    @ManyToOne(
            targetEntity = Appointment.class,
            cascade = CascadeType.MERGE
    )
    @JoinColumn(name = "id_appointment")
    private Appointment appointment;
}
