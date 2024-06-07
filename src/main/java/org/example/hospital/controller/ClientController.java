package org.example.hospital.controller;

import lombok.AllArgsConstructor;
import org.example.hospital.dto.ClientDTO;
import org.example.hospital.entity.Client;
import org.example.hospital.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody ClientDTO dto) {

        return new ResponseEntity<>(clientService.create(dto), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Client>> readAll() {

        return new ResponseEntity<>(clientService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> readById(@PathVariable Integer id) {

        return new ResponseEntity<>(clientService.readById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Client> update(@RequestBody Client client) {

        return new ResponseEntity<>(clientService.update(client), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        clientService.delete(id);
        return HttpStatus.OK;

    }

}
