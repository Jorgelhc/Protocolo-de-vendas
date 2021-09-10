package com.learning.protocoloDeVendas.model;


import lombok.Builder;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    private long idEmpresa;
    private String nome;
    private String CNPJ;
    private String cidade;
    private String estado;
    private String telefone;

}
