package org.example.hospital.service;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.ClientDTO;
import org.example.hospital.dto.EmployeeDTO;
import org.example.hospital.entity.Appointment;
import org.example.hospital.entity.Client;
import org.example.hospital.entity.Employee;
import org.example.hospital.repository.ClientRepository;
import org.example.hospital.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {


    private final EmployeeRepository employeeRepository;

    public Employee create(EmployeeDTO dto){
        return employeeRepository.save(Employee.builder()
                .address(dto.getAddress())
                .city(dto.getCity())
                .citizenship(dto.getCitizenship())
                .date(dto.getDate())
                .dateofbirthday(dto.getDateofbirthday())
                .post(dto.getPost())
                .money(dto.getMoney())
                .index(dto.getIndex())
                .numberofphone(dto.getNumberofphone())
                .region(dto.getRegion())
                .education(dto.getEducation())
                .country(dto.getCountry())
                .fioname(dto.getFioname())
                .email(dto.getEmail())
                .build());
    }

    public List<Employee> readAll() {

        return employeeRepository.findAll();
    }

    public Employee readById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found" + id));
    }

    public Employee update(Employee employee){
        return employeeRepository.save(employee);
    }

    public void delete(Integer id){

        employeeRepository.deleteById(id);
    }
}
