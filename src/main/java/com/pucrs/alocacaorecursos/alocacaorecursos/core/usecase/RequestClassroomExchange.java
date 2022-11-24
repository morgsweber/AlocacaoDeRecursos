package com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase;

import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestResult;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests.ResponseResultDTO;

public interface RequestClassroomExchange {    

    Optional<ResponseResultDTO> approveRequest(Integer requestId, boolean isApproved);

    Optional<RequestResult> getRequestResult(final Integer requestId);
     
}
