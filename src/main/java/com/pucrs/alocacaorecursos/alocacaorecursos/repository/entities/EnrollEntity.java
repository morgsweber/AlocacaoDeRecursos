package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "turma_aluno")
public class EnrollEntity {
    
    @Id
    @Column(name = "turma_aluno_id")
    private Integer enrollId;
    
    @Column(name = "turma_id")
    private Integer lectureGroupId;
    
    @Column(name = "aluno_id")
    private Integer studentId;
}

