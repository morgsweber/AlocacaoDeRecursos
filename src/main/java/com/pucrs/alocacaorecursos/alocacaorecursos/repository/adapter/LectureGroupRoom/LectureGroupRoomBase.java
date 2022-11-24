package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.LectureGroupRoom;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureGroupRoomEntity;

public interface LectureGroupRoomBase extends CrudRepository<LectureGroupRoomEntity, Integer> {
    
    List<LectureGroupRoomEntity> findByGroupId(Integer groupId);
}
