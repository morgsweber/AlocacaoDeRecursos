package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TeacherLecturesResponse {

    private String discipline;
    private String teacherName;
    private String groupId;

}
