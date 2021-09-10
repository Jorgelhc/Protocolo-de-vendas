package com.learning.protocoloDeVendas.repository;


import com.learning.protocoloDeVendas.model.Protocolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocoloRepository extends JpaRepository<Protocolo, Long> {
}
