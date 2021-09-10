package com.learning.protocoloDeVendas.service;


import com.learning.protocoloDeVendas.model.Protocolo;
import com.learning.protocoloDeVendas.repository.ProtocoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProtocoloService {

    @Autowired
    ProtocoloRepository protocoloRepository;

    public Protocolo save(Protocolo protocolo) {
        return protocoloRepository.save(protocolo);
    }

    public List<Protocolo> findAll() {
        return protocoloRepository.findAll();
    }

    public Optional<Protocolo> findById(Long idProtocolo) throws Exception {
        return protocoloRepository.findById(idProtocolo);
    }

    public Protocolo updateProtocolo(Protocolo protocolo) {
        return protocoloRepository.save(protocolo);
    }

    public void deleteById(Long idProtocolo) throws Exception {
        protocoloRepository.deleteById(idProtocolo);
    }
}
