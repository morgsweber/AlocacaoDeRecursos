package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RequestDTO{

    private String lecture;
    private String teacher;
    private String lectureGroup;
    private String currentClassroom;
    private String newClassroom;
    private String motive;        
}