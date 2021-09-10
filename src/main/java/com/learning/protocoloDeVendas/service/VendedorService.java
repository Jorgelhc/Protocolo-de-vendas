package com.learning.protocoloDeVendas.service;


import com.learning.protocoloDeVendas.model.Vendedor;
import com.learning.protocoloDeVendas.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorService {

    @Autowired
    VendedorRepository vendedorRepository;

    public Vendedor save(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public List<Vendedor> findAll() {
        return vendedorRepository.findAll();
    }

    public Optional<Vendedor> findById(Long idVendedor) throws Exception {
        return vendedorRepository.findById(idVendedor);
    }

    public Vendedor updateVendedor(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public void deleteById(Long idVendedor) throws Exception {
        vendedorRepository.deleteById(idVendedor);
    }
}
