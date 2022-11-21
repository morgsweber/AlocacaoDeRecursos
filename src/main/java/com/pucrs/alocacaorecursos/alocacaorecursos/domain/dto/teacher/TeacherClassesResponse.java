package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TeacherClassesResponse {

    private String date; 
    private String description;
    private String buildingRoom;
    private String name;
    private String classID;
}
