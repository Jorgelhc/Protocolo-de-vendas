package com.learning.protocoloDeVendas.controller;


import com.learning.protocoloDeVendas.model.Vendedor;
import com.learning.protocoloDeVendas.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    VendedorService vendedorService;

    @PostMapping
    public Vendedor createVendedor(@RequestBody Vendedor vendedor) {
        return vendedorService.save(vendedor);
    }

    @GetMapping
    public List<Vendedor> findAll() {
        return vendedorService.findAll();
    }

    @GetMapping("/{idVendedor}")
    public ResponseEntity<Vendedor> getVendedorById(@PathVariable("idVendedor") Long idVendedor) throws Exception {
        return ResponseEntity.ok(vendedorService.findById(idVendedor).orElseThrow(() -> new Exception("Vendedor não encontrado")));
    }

    @PutMapping
    public Vendedor updateVendedor(@RequestBody Vendedor vendedor) {
        return vendedorService.updateVendedor(vendedor);
    }

    @DeleteMapping("/{idVendedor}")
    public void deleteVendedor(@PathVariable("idVendedor") Long idVendedor) throws Exception {
        vendedorService.deleteById(idVendedor);
    }
}

