package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
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