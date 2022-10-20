package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;
import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teacher;

public interface TeacherPortOutput {

    Teacher getTeacher(String id);
    
}