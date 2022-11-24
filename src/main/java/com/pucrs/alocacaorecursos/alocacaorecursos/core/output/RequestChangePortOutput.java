package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.TeacherRequest;

public interface RequestChangePortOutput {

    void save(final RequestChange requestChange);

    List<TeacherRequest> getAllRequests();

    Boolean existsById(final Integer requestId);
}
