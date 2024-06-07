package org.example.hospital.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDTO {

    private String address;
    private String city;
    private String citizenship;
    private LocalDateTime date;
    private LocalDateTime dateofbirthday;
    private String post;
    private Integer money;
    private Integer index;
    private String numberofphone;
    private String region;
    private String education;
    private String country;
    private String fioname;
    private String email;
}
