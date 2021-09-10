package com.learning.protocoloDeVendas.service;


import com.learning.protocoloDeVendas.model.Empresa;
import com.learning.protocoloDeVendas.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(Long idEmpresa) throws Exception {
        return empresaRepository.findById(idEmpresa);
    }

    public Empresa updateEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteById(Long idEmpresa) throws Exception {
        empresaRepository.deleteById(idEmpresa);
    }
}
