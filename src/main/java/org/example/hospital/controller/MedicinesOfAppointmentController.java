package org.example.hospital.controller;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.MedicinesDTO;
import org.example.hospital.dto.MedicinesOfAppointmentDTO;
import org.example.hospital.entity.Medicines;
import org.example.hospital.entity.MedicinesOfAppointment;
import org.example.hospital.service.MedicinesOfAppointmentService;
import org.example.hospital.service.MedicinesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines_of_appointment")
@AllArgsConstructor
public class MedicinesOfAppointmentController {
    private final MedicinesOfAppointmentService medicinesOfAppointmentService;

    @PostMapping
    public ResponseEntity<MedicinesOfAppointment> create(@RequestBody MedicinesOfAppointmentDTO dto) {

        return new ResponseEntity<>(medicinesOfAppointmentService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MedicinesOfAppointment>> readAll() {

        return new ResponseEntity<>(medicinesOfAppointmentService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicinesOfAppointment> readById(@PathVariable Integer id) {

        return new ResponseEntity<>(medicinesOfAppointmentService.readById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<MedicinesOfAppointment> update(@RequestBody MedicinesOfAppointment medicinesOfAppointment) {

        return new ResponseEntity<>(medicinesOfAppointmentService.update( medicinesOfAppointment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        medicinesOfAppointmentService.delete(id);
        return HttpStatus.OK;

    }
}
