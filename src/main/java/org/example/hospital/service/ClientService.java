package org.example.hospital.service;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.AppointmentDTO;
import org.example.hospital.dto.ClientDTO;
import org.example.hospital.entity.Appointment;
import org.example.hospital.entity.Client;
import org.example.hospital.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client create(ClientDTO dto){
        return clientRepository.save(Client.builder()
                .address(dto.getAddress())
                .city(dto.getCity())
                .citizenship(dto.getCitizenship())
                .dateofbirthday(dto.getDateofbirthday())
                .region(dto.getRegion())
                .oms(dto.getOms())
                .dataofpassport(dto.getDataofpassport())
                .gender(dto.getGender())
                .snils(dto.getSnils())
                .country(dto.getCountry())
                .phonenumber(dto.getPhonenumber())
                .fioname(dto.getFioname())
                .email(dto.getEmail())
                .build());
    }

    public List<Client> readAll() {

        return clientRepository.findAll();
    }

    public Client readById(Integer id) {
        return clientRepository.findById(id).orElseThrow(()-> new RuntimeException("Client not found" + id));
    }

    public Client update(Client client){
        return clientRepository.save(client);
    }

    public void delete(Integer id){

        clientRepository.deleteById(id);
    }


}
