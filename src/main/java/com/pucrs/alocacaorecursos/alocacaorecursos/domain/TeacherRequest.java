package com.pucrs.alocacaorecursos.alocacaorecursos.domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherRequest {
    private int teacherId, currentClassroomId, newLocation, requestId,lectureId,lectureGroupId;
    private String justification;
}
