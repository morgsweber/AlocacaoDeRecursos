package com.pucrs.alocacaorecursos.alocacaorecursos.domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherRequest {

    private Integer teacherId; 
    private Integer currentClassroomId; 
    private Integer newLocation; 
    private Integer requestId;
    private Integer lectureId;
    private Integer lectureGroupId;
    private String justification;
    
}
