package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sala")
public class ClassRoomEntity {

    @Id
    private String id;

    @Column(name = "predio")
    private String building;

    @Column(name = "capacidade")
    private int capacity;

    @Column(name = "tipo")
    private String type;
    
}
