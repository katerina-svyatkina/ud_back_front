package org.example.hospital.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AnalysesOfAppointmentDTO {


    private LocalDateTime date;
    private Long sale;
    private Integer cost;
}
