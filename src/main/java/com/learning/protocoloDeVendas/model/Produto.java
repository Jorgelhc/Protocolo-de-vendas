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
public class Produto {
    @Id
    private long idProduto;
    private String nome;
    private String tipo;
    private float precoDeVenda;
    private float precoDeFabricacao;


}
