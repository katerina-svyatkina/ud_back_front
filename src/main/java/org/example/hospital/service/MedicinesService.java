package org.example.hospital.service;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.EmployeeDTO;
import org.example.hospital.dto.MedicinesDTO;
import org.example.hospital.entity.Employee;
import org.example.hospital.entity.Medicines;
import org.example.hospital.repository.EmployeeRepository;
import org.example.hospital.repository.MedicinesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedicinesService {

    private final MedicinesRepository medicinesRepository;

    public Medicines create(MedicinesDTO dto){
        return medicinesRepository.save(Medicines.builder()
                .name(dto.getName())
                .date(dto.getDate())
                .allmedicines(dto.getAllmedicines())
                .cost(dto.getCost())
                .availability(dto.getAvailability())
                .byprescription(dto.getByprescription())
                .country(dto.getCountry())
                .build());
    }

    public List<Medicines> readAll() {

        return medicinesRepository.findAll();
    }

    public Medicines readById(Integer id) {
        return medicinesRepository.findById(id).orElseThrow(()-> new RuntimeException("Medicines not found" + id));
    }

    public Medicines update(Medicines medicines){
        return medicinesRepository.save(medicines);
    }

    public void delete(Integer id){

        medicinesRepository.deleteById(id);
    }

}
