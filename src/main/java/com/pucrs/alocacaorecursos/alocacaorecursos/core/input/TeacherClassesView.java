package com.pucrs.alocacaorecursos.alocacaorecursos.core.input;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherClassesResponse;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

public interface TeacherClassesView {
    
    List<TeacherClassesResponse> getTeacherLectures(final String teacherId);
    
}
