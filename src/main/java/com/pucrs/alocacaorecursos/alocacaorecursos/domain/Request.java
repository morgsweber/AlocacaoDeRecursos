package com.pucrs.alocacaorecursos.alocacaorecursos.domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
    private int professorId, currentClassroomId, newLocation;
    private String justification;
}
