package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.TeacherRequest;

public interface RequestPortOutput {
    List<TeacherRequest> getAllRequests();
}
