package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.requestchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestResultPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestResult;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.RequestResultMapper;

@Repository
public class RequestResultPortOutputImpl implements RequestResultPortOutput {

    @Autowired
    private RequestResultBase repository;

    @Override
    public void save(RequestResult result) {
        repository.save(RequestResultMapper.mapFrom(result));        
    }

    @Override
    public RequestResult getResult(Integer requestId) {
        return RequestResultMapper.mapFrom(repository.findById(requestId));
    }
    
}
