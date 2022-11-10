package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TeacherLecturesResponse {

    private String discipline;
    private String teacherName;
    private Integer groupId;

}
