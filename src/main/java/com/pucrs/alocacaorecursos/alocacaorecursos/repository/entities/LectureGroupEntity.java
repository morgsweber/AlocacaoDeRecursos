package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "turma" )
public class LectureGroupEntity {

    @Id
    @Column(name = "turma_id")
    private Integer id;
}
