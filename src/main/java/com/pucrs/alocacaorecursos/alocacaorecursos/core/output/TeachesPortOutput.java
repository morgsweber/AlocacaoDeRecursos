package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;

public interface TeachesPortOutput {
    
    List<Teaches> getTeaches(final String teacherId);
    
}
