package org.example.hospital.controller;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.EmployeeDTO;
import org.example.hospital.entity.Employee;
import org.example.hospital.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @PostMapping
    public ResponseEntity<Employee> create(@RequestBody EmployeeDTO dto) {

        return new ResponseEntity<>(employeeService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> readAll() {

        return new ResponseEntity<>(employeeService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> readById(@PathVariable Integer id) {

        return new ResponseEntity<>(employeeService.readById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Employee> update(@RequestBody Employee employee) {

        return new ResponseEntity<>(employeeService.update(employee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        employeeService.delete(id);
        return HttpStatus.OK;

    }

}
