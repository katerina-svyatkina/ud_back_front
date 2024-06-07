package org.example.hospital.service;


import lombok.AllArgsConstructor;
import org.example.hospital.dto.AppointmentDTO;
import org.example.hospital.entity.Appointment;
import org.example.hospital.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentService {


    private final AppointmentRepository appointmentRepository;
    private final ClientService clientService;
    private final EmployeeService employeeService;

    public  Appointment create(AppointmentDTO dto){
        return appointmentRepository.save(Appointment.builder()
                .dateOfAppointment(LocalDateTime.from(dto.getDateOfAppointment()))
                .cost(dto.getCost())
                .client(clientService.readById(dto.getId_client()))
                .employee(employeeService.readById(dto.getId_employee()))
                .build());
    }

    public  List<Appointment> readByClientId(Integer client_id){

        return  appointmentRepository.findByClient_Id_client(client_id);
    }

    public List<Appointment> readByEmployeeId(Integer employee_id){

        return  appointmentRepository.findByEmployee_Id_employee(employee_id);
    }
    public List<Appointment> readAll(){

        return appointmentRepository.findAll();
    }



    public Appointment update(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public void delete(Integer id){

        appointmentRepository.deleteById(id);
    }

}
