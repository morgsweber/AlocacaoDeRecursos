package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "turma_aluno")
public class RegistrationStudentEntity {

    @Column(name = "aluno_id")    
    private String studentId;
    
    @Column(name = "aluno_id")
    private String groupId;
    
}
