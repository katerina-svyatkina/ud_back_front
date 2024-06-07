

package org.example.hospital.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="client")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_client;

    @Column(name= "address")
    private String address;

    @Column(name= "city")
    private String city;

    @Column(name= "citizenship")
    private String citizenship;

    @Column(name= "dateofbirthday")
    private String dateofbirthday;

    @Column(name= "region")
    private String region;

    @Column(name= "oms")
    private String oms;

    @Column(name= "dataofpassport")
    private String dataofpassport;

    @Column(name= "gender")
    private String gender;

    @Column(name= "snils")
    private String snils;

    @Column(name= "country")
    private String country;

    @Column(name= "phonenumber")
    private String phonenumber;

    @Column(name= "fioname")
    private String fioname;

    @Column(name= "email")
    private String email;



}
