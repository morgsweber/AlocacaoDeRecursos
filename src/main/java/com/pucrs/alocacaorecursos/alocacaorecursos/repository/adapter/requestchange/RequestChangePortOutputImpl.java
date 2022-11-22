package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.requestchange;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestChangePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.TeacherRequest;

@Repository
public class RequestChangePortOutputImpl implements RequestChangePortOutput{

    @Override
    public void save(final RequestChange requestChange) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<TeacherRequest> getAllRequests() {
        // TODO Auto-generated method stub
        return null;
    } 
    
}
