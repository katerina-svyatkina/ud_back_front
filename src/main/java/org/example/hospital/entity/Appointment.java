package org.example.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer   id_appointment;

    @Column(name = "dataofappointment")
    private LocalDateTime dateOfAppointment;

    @Column(name = "cost")
    private Long   cost;

    @ManyToOne(
            targetEntity = Client.class,
            cascade = CascadeType.MERGE
    )
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    private Client client;

    @ManyToOne(
            targetEntity = Employee.class,
            cascade = CascadeType.MERGE
    )
    @JoinColumn(name = "id_employee", referencedColumnName = "id_employee")
    private Employee employee;

}
