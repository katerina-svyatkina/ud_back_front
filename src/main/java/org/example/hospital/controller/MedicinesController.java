package org.example.hospital.controller;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.MedicinesDTO;
import org.example.hospital.entity.Medicines;
import org.example.hospital.service.MedicinesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
@AllArgsConstructor
public class MedicinesController {

    private final MedicinesService medicinesService;

    @PostMapping
    public ResponseEntity<Medicines> create(@RequestBody MedicinesDTO dto) {

        return new ResponseEntity<>(medicinesService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Medicines>> readAll() {

        return new ResponseEntity<>(medicinesService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicines> readById(@PathVariable Integer id) {

        return new ResponseEntity<>(medicinesService.readById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Medicines> update(@RequestBody Medicines medicines) {

        return new ResponseEntity<>(medicinesService.update(medicines), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        medicinesService.delete(id);
        return HttpStatus.OK;

    }
}
