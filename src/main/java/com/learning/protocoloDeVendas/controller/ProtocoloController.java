package com.learning.protocoloDeVendas.controller;


import com.learning.protocoloDeVendas.model.Protocolo;
import com.learning.protocoloDeVendas.service.ProtocoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/protocolo")
public class ProtocoloController {

    @Autowired
    ProtocoloService protocoloService;

    @PostMapping
    public Protocolo createProtocolo(@RequestBody Protocolo protocolo) {
        return protocoloService.save(protocolo);
    }

    @GetMapping
    public List<Protocolo> findAll() {
        return protocoloService.findAll();
    }

    @GetMapping("/{idProtocolo}")
    public ResponseEntity<Protocolo> getProtocoloById(@PathVariable("idProtocolo") Long idProtocolo) throws Exception {
        return ResponseEntity.ok(protocoloService.findById(idProtocolo).orElseThrow(() -> new Exception("Protocolo não encontrado")));
    }

    @PutMapping
    public Protocolo updateProtocolo(@RequestBody Protocolo protocolo) {
        return protocoloService.updateProtocolo(protocolo);
    }

    @DeleteMapping("/{idProtocolo}")
    public void deleteProtocolo(@PathVariable("idProtocolo") Long idProtocolo) throws Exception {
        protocoloService.deleteById(idProtocolo);
    }
}

