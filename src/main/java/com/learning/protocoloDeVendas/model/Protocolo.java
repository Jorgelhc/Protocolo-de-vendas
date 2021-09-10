package com.learning.protocoloDeVendas.model;


import lombok.Builder;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@Audited
public class Protocolo {

    @Id
    @EmbeddedId
    private ProtocoloId id;
    @ManyToOne
    private Vendedor vendedor;
    private int quantidade;
    private float valorTotal;
    @ManyToOne
    private Produto produto;

    @Embeddable
    @Data
    public class ProtocoloId implements Serializable {
        @ManyToOne
        private Empresa empresa;
        private long idProtocolo;


    }


}
