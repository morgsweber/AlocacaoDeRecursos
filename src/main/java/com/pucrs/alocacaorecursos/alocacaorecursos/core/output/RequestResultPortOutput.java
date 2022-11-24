package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestResult;

public interface RequestResultPortOutput {

    void save(final RequestResult result);

    RequestResult getResult(final Integer requestId);

}
