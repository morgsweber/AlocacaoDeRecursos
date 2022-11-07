package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "disciplina")
public class LectureEntity {
    
    @Id
    @Column(name = "disciplina_id")
    private String id;

    @Column(name = "nome")
    private String name;

    @Column(name = "ementa")
    private String content;
}
