package com.pucrs.alocacaorecursos.alocacaorecursos.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureGroupRoom {

    private Integer groupId;

    private Integer roomId;

    private String description;

    private String hour;

    private String day;

}
