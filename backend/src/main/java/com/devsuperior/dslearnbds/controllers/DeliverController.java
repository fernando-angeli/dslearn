package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverController {

    @Autowired
    private DeliverService service;

    @PutMapping("/{id}")
    public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto){
        service.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }
}
