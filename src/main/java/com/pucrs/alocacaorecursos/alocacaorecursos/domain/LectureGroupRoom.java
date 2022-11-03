package com.pucrs.alocacaorecursos.alocacaorecursos.domain;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureGroupRoom {

    @Column(name = "turma_id")
    private String lectureGroupId;

    @Column(name = "sala_id")
    private String ClassRoomId;

    @Column(name = "descricao")
    private String description;

    @Column(name = "horario")
    private String hour;

    @Column(name = "dia")
    private String day;

}
