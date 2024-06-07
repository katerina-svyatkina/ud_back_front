package org.example.hospital.controller;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.AnalysesOfAppointmentDTO;
import org.example.hospital.entity.AnalysesOfAppointment;
import org.example.hospital.service.AnalysesOfAppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analyses_of_appointment")
@AllArgsConstructor
public class AnalysesOfAppointmentController {
    private final AnalysesOfAppointmentService analysesOfAppointmentService;

    @PostMapping
    public ResponseEntity<AnalysesOfAppointment> create(@RequestBody AnalysesOfAppointmentDTO dto) {

        return new ResponseEntity<>(analysesOfAppointmentService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<AnalysesOfAppointment>> readAll() {
        return new ResponseEntity<>(analysesOfAppointmentService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id_appointment}")
    public ResponseEntity<AnalysesOfAppointment> readByClientId(@PathVariable Integer id_appointment) {
        return new ResponseEntity<>(analysesOfAppointmentService.readById(id_appointment), HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<AnalysesOfAppointment> update(@RequestBody AnalysesOfAppointment analysesOfAppointment) {

        return new ResponseEntity<>(analysesOfAppointmentService.update(analysesOfAppointment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        analysesOfAppointmentService.delete(id);
        return HttpStatus.OK;

    }
}
