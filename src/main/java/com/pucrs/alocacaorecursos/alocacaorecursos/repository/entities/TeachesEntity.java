package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ministra")
public class TeachesEntity {
    
    @Id
    @Column(name = "ministra_id")
    private Integer id;
    
    @Column(name = "professor_id")
    private Integer teacherId;
    
    @Column(name = "turma_id")
    private Integer groupId;

    @Column(name = "disciplina_id")
    private Integer disciplinaId;
}

