package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.requestchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestChangePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.TeacherRequest;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.RequestChangeMapper;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.RequestChangeEntity;

@Repository
public class RequestChangePortOutputImpl implements RequestChangePortOutput {

    @Autowired
    private RequestChangeBase respository;

    @Override
    public void save(final RequestChange requestChange) {

        respository.save(RequestChangeMapper.mapTo(requestChange));
        
    }

    @Override
    public List<TeacherRequest> getAllRequests() {
        
        Iterable<RequestChangeEntity> list = respository.findAll();

        List<RequestChangeEntity> response = StreamSupport.stream(list.spliterator(), false)
        .filter(Objects::nonNull)
        .toList();

        return !response.isEmpty() ? response.stream().map(item -> RequestChangeMapper.mapToDomain(item)).toList() : new ArrayList<>();
    }

    @Override
    public Boolean existsById(Integer requestId) {
        return respository.existsById(requestId);
    } 
    
}
