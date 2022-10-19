package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;
import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;

public interface LecturePortOutput {

    Lecture getLecture(String id);
    
}
