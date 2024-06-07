package org.example.hospital.service;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.ClientDTO;
import org.example.hospital.dto.ResultsDTO;
import org.example.hospital.entity.Client;
import org.example.hospital.entity.Results;
import org.example.hospital.repository.ResultsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResultsService {

    private final ResultsRepository resultsRepository;

    public Results create(ResultsDTO dto){
        return resultsRepository.save(Results.builder()
                .dateofresults(dto.getDateofresults())
                .dateofcollection(dto.getDateofcollection())
                .standart(dto.getStandart())
                .result(dto.getResult())
                .comment(dto.getComment())
                .build());
    }

    public List<Results> readAll() {

        return resultsRepository.findAll();
    }

    public Results readById(Integer id) {
        return resultsRepository.findById(id).orElseThrow(()-> new RuntimeException("Results not found" + id));
    }

    public Results update(Results results){
        return resultsRepository.save(results);
    }

    public void delete(Integer id){

        resultsRepository.deleteById(id);
    }
}
