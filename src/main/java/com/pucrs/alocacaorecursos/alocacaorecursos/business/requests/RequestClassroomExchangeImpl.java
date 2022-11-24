package com.pucrs.alocacaorecursos.alocacaorecursos.business.requests;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestChangePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestResultPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase.RequestClassroomExchange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestResult;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests.ResponseResultDTO;

@Component
public class RequestClassroomExchangeImpl implements RequestClassroomExchange {

    @Autowired
    private RequestResultPortOutput requestResultPortOutput;

    @Autowired
    private RequestChangePortOutput requestChangePortOutput;

    @Override
    public Optional<ResponseResultDTO> approveRequest(Integer requestId, boolean isApproved) {

        final boolean request = requestChangePortOutput.existsById(requestId);

        if(request) {
            var result = new RequestResult(requestId, isApproved);

            requestResultPortOutput.save(result);
            
        }

        return request ? Optional.ofNullable(new ResponseResultDTO(String.valueOf(isApproved), "Solicitacao Aprovada")) : 
                            Optional.ofNullable(new ResponseResultDTO(String.valueOf(isApproved), "Solicitacao Reprovada"));
        
    }

    @Override
    public Optional<RequestResult> getRequestResult(Integer requestId) {

        return Optional.ofNullable(requestResultPortOutput.getResult(requestId));
        
    }
    
}
