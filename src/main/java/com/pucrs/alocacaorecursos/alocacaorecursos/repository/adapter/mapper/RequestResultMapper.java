package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestResult;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.RequestResultEntity;

public class RequestResultMapper {

    public static RequestResult mapFrom(final Optional<RequestResultEntity> optional) {
        var domain = new RequestResult();

        if(optional.isEmpty()) {
           return null;
        }
        var domainGet = optional.get();

        domain.setRequestId(domainGet.getRequestId());
        domain.setStatus(domainGet.getStatus());

        return domain;
    }

    public static RequestResultEntity mapFrom(final RequestResult domain) {
        var entity = new RequestResultEntity();

        Optional<RequestResult> optionalEntity = Optional.ofNullable(domain);

        optionalEntity.map(RequestResult::getRequestId);
        optionalEntity.map(RequestResult::getStatus);

        if(optionalEntity.isPresent()) {
            var domainGet = optionalEntity.get();

            entity.setRequestId(domainGet.getRequestId());
            entity.setStatus(domainGet.getStatus());
        }

        return entity;
    }
    
}
