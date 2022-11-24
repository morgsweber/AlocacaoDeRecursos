package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "turma_sala")
public class LectureGroupRoomEntity {

    @Id
    @Column(name = "turma_id")
    private Integer groupId;
    
    @Column(name = "sala_id")
    private Integer roomId;

    @Column(name = "descricao")
    private String description;

    @Column(name = "horario")
    private String scheduled;

    @Column(name = "dia")
    private LocalDateTime dayOfWeek;

}
