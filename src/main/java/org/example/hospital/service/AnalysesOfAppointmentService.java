package org.example.hospital.service;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.AnalysesOfAppointmentDTO;
import org.example.hospital.entity.AnalysesOfAppointment;
import org.example.hospital.repository.AnalysesOfAppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AnalysesOfAppointmentService {

    private final AnalysesOfAppointmentRepository analysesOfAppointmentRepository;


    public AnalysesOfAppointment create(AnalysesOfAppointmentDTO dto){
        return analysesOfAppointmentRepository.save(AnalysesOfAppointment.builder()
                .cost(dto.getCost())
                .date(dto.getDate())
                .sale(dto.getSale())
                .build());
    }

    public List<AnalysesOfAppointment> readAll() {

        return analysesOfAppointmentRepository.findAll();
    }

    public AnalysesOfAppointment readById(Integer id) {
        return analysesOfAppointmentRepository.findById(id).orElseThrow(()-> new RuntimeException("Analyses not found" + id));
    }

    public AnalysesOfAppointment update(AnalysesOfAppointment analysesOfAppointment){
        return analysesOfAppointmentRepository.save(analysesOfAppointment);
    }

    public void delete(Integer id){

        analysesOfAppointmentRepository.deleteById(id);
    }
}
