package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.LectureGroupRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureGroupRoomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroupRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.LectureGroupRoomMapper;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureGroupRoomEntity;

@Repository
public class LectureGroupRoomPortOutputImpl implements LectureGroupRoomPortOutput {

    @Autowired
    private LectureGroupRoomBase lectureGroupRoomBase;

    
    @Override
    public List<LectureGroupRoom> getLectureGroupRoom(String groupId) {
        List<LectureGroupRoomEntity> list = lectureGroupRoomBase.findByGroupId(Integer.parseInt(groupId));
        List<LectureGroupRoom> listMapped = new ArrayList<>();

        listMapped = list.stream().map(item -> LectureGroupRoomMapper.mapFrom(item)).collect(Collectors.toList());

        return list.isEmpty() ? new ArrayList<>() : listMapped;   
        
    }

     
}
