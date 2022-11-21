package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom;

public interface ClassroomPortOutput {
    
    ClassRoom getClassroom(final String id);
}
