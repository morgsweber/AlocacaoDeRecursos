package com.pucrs.alocacaorecursos.alocacaorecursos.domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherRequest {
    private int professorId, currentClassroomId, newLocation, requestId;
    private String justification;
}
