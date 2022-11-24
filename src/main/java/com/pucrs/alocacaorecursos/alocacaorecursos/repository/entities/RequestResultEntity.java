package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "resultado")
public class RequestResultEntity {
    
    @Id
    @Column(name = "pedido_id")
    private Integer requestId;

    @Column(name = "status")
    private Boolean status;
}
