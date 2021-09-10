package com.learning.protocoloDeVendas.controller;


import com.learning.protocoloDeVendas.model.Empresa;
import com.learning.protocoloDeVendas.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.save(empresa);
    }

    @GetMapping
    public List<Empresa> findAll() {
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idEmpresa") Long idEmpresa) throws Exception {
        return ResponseEntity.ok(empresaService.findById(idEmpresa).orElseThrow(() -> new Exception("Empresa não encontrada")));
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public void deleteEmpresa(@PathVariable("idEmpresa") Long idEmpresa) throws Exception {
        empresaService.deleteById(idEmpresa);
    }
}

