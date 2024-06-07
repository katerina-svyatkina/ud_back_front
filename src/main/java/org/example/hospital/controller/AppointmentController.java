package org.example.hospital.controller;


import lombok.AllArgsConstructor;
import org.example.hospital.dto.AppointmentDTO;
import org.example.hospital.entity.Appointment;
import org.example.hospital.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@AllArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping
    public ResponseEntity<Appointment> create(@RequestBody AppointmentDTO dto) {

        return new ResponseEntity<>(appointmentService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Appointment>> readAll() {
        return new ResponseEntity<>(appointmentService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/clients/{id_client}")
    public ResponseEntity<List <Appointment>> readByClientId(@PathVariable Integer id_client) {
        return new ResponseEntity<>(appointmentService.readByClientId(id_client), HttpStatus.OK);
    }

    @GetMapping("/employees/{id_employee}")
    public ResponseEntity<List <Appointment>> readByEmployeeId(@PathVariable Integer id_employee) {
        return new ResponseEntity<>(appointmentService.readByEmployeeId(id_employee), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Appointment> update(@RequestBody Appointment appointment) {

        return new ResponseEntity<>(appointmentService.update(appointment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        appointmentService.delete(id);
        return HttpStatus.OK;

    }


}
