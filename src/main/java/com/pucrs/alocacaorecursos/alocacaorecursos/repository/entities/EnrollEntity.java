package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.IdClass;
import java.io.Serializable;

import lombok.Data;

@Data
@Entity
@Table(name = "turma_aluno")
@IdClass(EnrollId.class)
public class EnrollEntity implements Serializable{
    
    @Id
    @Column(name = "turma_id")
    private Integer lectureGroupId;
    
    @Id
    @Column(name = "aluno_id")
    private Integer studentId;
}

