package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroup;

public interface LectureGroupPortOutput {
    LectureGroup getLectureGroup(final String id);
}
