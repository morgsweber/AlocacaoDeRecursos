package com.pucrs.alocacaorecursos.alocacaorecursos.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestChange {

    private Integer requestId;
    private Integer teacherId;
    private Integer currentClassroomId;
    private Integer newClassroomId;
    private Integer lectureId;
    private Integer lectureGroupId;
    private String motive;
    
}
