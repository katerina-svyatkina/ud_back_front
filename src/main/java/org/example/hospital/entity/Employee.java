package org.example.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="employee")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_employee;

    @Column(name= "address")
    private String address;

    @Column(name= "city")
    private String city;

    @Column(name= "citizenship")
    private String citizenship;

    @Column(name= "date")
    private LocalDateTime date;

    @Column(name= "dateofbirthday")
    private LocalDateTime dateofbirthday;

    @Column(name= "post")
    private String post;

    @Column(name= "money")
    private Integer money;

    @Column(name= "index")
    private Integer index;

    @Column(name= "numberofphone")
    private String numberofphone;

    @Column(name= "region")
    private String region;

    @Column(name= "education")
    private String education;

    @Column(name= "country")
    private String country;

    @Column(name= "fioname")
    private String fioname;

    @Column(name= "email")
    private String email;
}
