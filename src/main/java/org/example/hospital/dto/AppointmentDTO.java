package org.example.hospital.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AppointmentDTO {

    private LocalDate dateOfAppointment;
    private Long cost;
    private Integer id_client;
    private Integer id_employee;


}
