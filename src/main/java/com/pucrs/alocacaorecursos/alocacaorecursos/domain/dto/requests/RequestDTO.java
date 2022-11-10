package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RequestDTO{

    private String lectureName;
    private String teacherName;
    private String lectureGroupId;
    private String currentClassroomId;
    private String currentClassroomType;
    private String newClassroomId;
    private String newClassroomType;
    private String motive;        
}