package com.pucrs.alocacaorecursos.alocacaorecursos.core.input;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

public interface TeacherLecturesView {
    
    List<TeacherLecturesResponse> getTeacherLectures(final Integer teacherId);
    
}
