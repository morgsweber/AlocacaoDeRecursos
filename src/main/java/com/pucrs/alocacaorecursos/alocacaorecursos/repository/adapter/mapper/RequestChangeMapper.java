package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.RequestChangeEntity;

public class RequestChangeMapper {
    
    public static RequestChange mapTo(final RequestChangeEntity entity) {
        var domain = new RequestChange();

        Optional<RequestChangeEntity> optionalEntity = Optional.ofNullable(entity);

        optionalEntity.map(RequestChangeEntity::getRequestId);
        optionalEntity.map(RequestChangeEntity::getTeacherId);
        optionalEntity.map(RequestChangeEntity::getMotive);
        optionalEntity.map(RequestChangeEntity::getLectureId);
        optionalEntity.map(RequestChangeEntity::getCurrentClassroomId);
        optionalEntity.map(RequestChangeEntity::getNewClassroomId);
        optionalEntity.map(RequestChangeEntity::getLectureGroupId);

        if(optionalEntity.isPresent()) {
            var domainGet = optionalEntity.get();

            entity.setRequestId(domainGet.getRequestId());
            entity.setTeacherId(domainGet.getTeacherId());
            entity.setMotive(domainGet.getMotive());
            entity.setLectureId(domainGet.getLectureId());
            entity.setCurrentClassroomId(domainGet.getCurrentClassroomId());
            entity.setNewClassroomId(domainGet.getNewClassroomId());
            entity.setLectureGroupId(domainGet.getLectureGroupId());
        }

        return domain;
    } 

    public static RequestChangeEntity mapTo(final RequestChange domain) {
        var entity = new RequestChangeEntity();

        Optional<RequestChange> optionalDomain = Optional.ofNullable(domain);

        optionalDomain.map(RequestChange::getRequestId);
        optionalDomain.map(RequestChange::getTeacherId);
        optionalDomain.map(RequestChange::getMotive);
        optionalDomain.map(RequestChange::getLectureId);
        optionalDomain.map(RequestChange::getCurrentClassroomId);
        optionalDomain.map(RequestChange::getNewClassroomId);
        optionalDomain.map(RequestChange::getLectureGroupId);

        if(optionalDomain.isPresent()) {
            var domainGet = optionalDomain.get();
            entity.setRequestId(domainGet.getRequestId());
            entity.setTeacherId(domainGet.getTeacherId());
            entity.setMotive(domainGet.getMotive());
            entity.setLectureId(domainGet.getLectureId());
            entity.setCurrentClassroomId(domainGet.getCurrentClassroomId());
            entity.setNewClassroomId(domainGet.getNewClassroomId());
            entity.setLectureGroupId(domainGet.getLectureGroupId());
        }

        return entity;
    }
}
