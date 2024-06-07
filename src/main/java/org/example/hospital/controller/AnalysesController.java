package org.example.hospital.controller;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.AnalysesDTO;
import org.example.hospital.entity.Analyses;
import org.example.hospital.service.AnalysesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analyses")
@AllArgsConstructor
public class AnalysesController {

    private final AnalysesService analysesService;

    @PostMapping
    public ResponseEntity<Analyses> create(@RequestBody AnalysesDTO dto) {

        return new ResponseEntity<>(analysesService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Analyses>> readAll() {

        return new ResponseEntity<>(analysesService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Analyses> readById(@PathVariable Integer id) {

        return new ResponseEntity<>(analysesService.readById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Analyses> update(@RequestBody Analyses analyses) {

        return new ResponseEntity<>(analysesService.update(analyses), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        analysesService.delete(id);
        return HttpStatus.OK;

    }
}
