package org.example.hospital.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResultsDTO {

    private LocalDateTime dateofresults;

    private LocalDateTime   dateofcollection;

    private String   comment;

    private Boolean   standart;

    private String   result;

}
