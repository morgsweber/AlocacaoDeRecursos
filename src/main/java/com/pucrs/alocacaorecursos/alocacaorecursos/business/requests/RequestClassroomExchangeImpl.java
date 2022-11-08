package com.pucrs.alocacaorecursos.alocacaorecursos.business.requests;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase.RequestClassroomExchange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.TeacherRequest;

public class RequestClassroomExchangeImpl implements RequestClassroomExchange {

    @Override
    public void requestClassroom(int professorId, int currentClassroomId, int newLocation, String justification) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void approveRequest(int requestId, boolean isApproved) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void declineRequest(int requestId, boolean isDecline) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<TeacherRequest> getAllRequests() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
