package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.lecture_room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureRoomEntity;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureRoomPortOutput;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.*;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.LectureRoomMapper;;

@Repository
public class LectureRoomPortOutputImpl implements LectureRoomPortOutput{

    @Autowired
    private LectureRoomBase lectureRoomRepository;

    @Override
    public List<LectureRoom> findLectureRoomByLectureGroupId(final Integer id){

        List<LectureRoomEntity> list = lectureRoomRepository.findLectureRoomByLectureGroupId(id);
        
        System.out.println("chegou em LectureRoomPortOutputImpl. prim id da consulta: " +list.get(0));
        
        List<LectureRoom> listMapped = new ArrayList<>();
        listMapped = list.stream().map(item -> LectureRoomMapper.mapFrom(item)).collect(Collectors.toList());
        
        return list.isEmpty() ? new ArrayList<>() : listMapped;
    }

    
}
