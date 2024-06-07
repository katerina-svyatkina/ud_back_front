package org.example.hospital.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AnalysesDTO {

    private String name;
    private String   description;
    private Boolean   omsornot;
    private String   cost;
}
