package org.example.hospital.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ClientDTO {
    private Integer id_client;
    private String address;
    private String city;
    private String citizenship;
    private String dateofbirthday;
    private String region;
    private String oms;
    private String dataofpassport;
    private String gender;
    private String snils;
    private String country;
    private String phonenumber;
    private String fioname;
    private String email;
}
