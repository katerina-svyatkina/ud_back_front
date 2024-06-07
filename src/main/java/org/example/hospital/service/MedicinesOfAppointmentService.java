package org.example.hospital.service;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.MedicinesOfAppointmentDTO;
import org.example.hospital.entity.AnalysesOfAppointment;
import org.example.hospital.entity.MedicinesOfAppointment;
import org.example.hospital.repository.AnalysesOfAppointmentRepository;
import org.example.hospital.repository.MedicinesOfAppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedicinesOfAppointmentService {

    private final MedicinesOfAppointmentRepository medicinesOfAppointmentRepository;


    public MedicinesOfAppointment create(MedicinesOfAppointmentDTO dto){
        return medicinesOfAppointmentRepository.save(MedicinesOfAppointment.builder()
                .quantity(dto.getQuantity())
                .allcost(dto.getAllcost())
                .build());
    }

    public List<MedicinesOfAppointment> readAll() {

        return medicinesOfAppointmentRepository.findAll();
    }

    public MedicinesOfAppointment readById(Integer id) {
        return medicinesOfAppointmentRepository.findById(id).orElseThrow(()-> new RuntimeException("Medicines not found" + id));
    }

    public MedicinesOfAppointment update(MedicinesOfAppointment medicinesOfAppointment){
        return medicinesOfAppointmentRepository.save(medicinesOfAppointment);
    }

    public void delete(Integer id){

        medicinesOfAppointmentRepository.deleteById(id);
    }
}
