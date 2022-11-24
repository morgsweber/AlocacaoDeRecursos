package com.pucrs.alocacaorecursos.alocacaorecursos.core.input;

import java.util.Map;
import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherResponseChangeDTO;

public interface TeacherRequestChange {
    Optional<TeacherResponseChangeDTO> execute(final String id, final String group_id, final Map<String, String> request);
}
