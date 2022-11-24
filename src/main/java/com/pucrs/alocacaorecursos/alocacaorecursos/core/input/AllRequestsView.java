package com.pucrs.alocacaorecursos.alocacaorecursos.core.input;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests.RequestDTO;

public interface AllRequestsView {
    
    List<RequestDTO> getListRequests();
    
}
