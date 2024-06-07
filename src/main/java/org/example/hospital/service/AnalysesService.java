package org.example.hospital.service;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.AnalysesDTO;
import org.example.hospital.dto.AppointmentDTO;
import org.example.hospital.entity.Analyses;
import org.example.hospital.entity.Appointment;
import org.example.hospital.entity.Client;
import org.example.hospital.repository.AnalysesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class AnalysesService {

    private  final AnalysesRepository analysesRepository;


    public Analyses create(AnalysesDTO dto){
        return analysesRepository.save(Analyses.builder()
                .name(dto.getName())
                .cost(dto.getCost())
                .omsornot(dto.getOmsornot())
                .description(dto.getDescription())
                .build());
    }

    public List<Analyses> readAll(){

        return analysesRepository.findAll();
    }
    public Analyses readById(Integer id) {
        return analysesRepository.findById(id).orElseThrow(()-> new RuntimeException("Analyses not found" + id));
    }
    public Analyses update(Analyses analyses){
        return analysesRepository.save(analyses);
    }

    public void delete(Integer id){

        analysesRepository.deleteById(id);
    }
}
