package org.example.hospital.dto;


import lombok.Data;

@Data
public class MedicinesDTO {

    private String date;
    private String   allmedicines;
    private String   name;
    private Integer   cost;
    private Boolean   availability;
    private Boolean  byprescription;
    private String   country;
}
