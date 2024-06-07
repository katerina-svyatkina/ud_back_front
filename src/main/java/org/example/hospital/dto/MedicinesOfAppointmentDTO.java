package org.example.hospital.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class MedicinesOfAppointmentDTO {

    private  Integer quantity;
    private Integer allcost;
}
