package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ministra")
public class TeachesEntity {
    
    @Column(name = "professor_id")
    private String teacherId;
    
    @Column(name = "turma_id")
    private String groupId;

    @Column(name = "disciplina_id")
    private String disciplinaId;
}

