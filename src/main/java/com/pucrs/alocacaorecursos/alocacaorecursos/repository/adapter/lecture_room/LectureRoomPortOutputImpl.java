package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.lecture_room;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureRoomEntity;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureRoomPortOutput;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.*;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.LectureRoomMapper;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.utils.ScheduleConversor;;

@Repository
public class LectureRoomPortOutputImpl implements LectureRoomPortOutput{

    @Autowired
    private LectureRoomBase lectureRoomRepository;

    @Override
    public List<LectureRoom> findLectureRoomByLectureGroupId(final Integer id){

        List<LectureRoomEntity> list = lectureRoomRepository.findByGroupId(id);
        
        System.out.println("chegou em LectureRoomPortOutputImpl. prim id da consulta: " +list.get(0));
        
        List<LectureRoom> listMapped = new ArrayList<>();
        listMapped = list.stream().map(item -> LectureRoomMapper.mapFrom(item)).collect(Collectors.toList());
        
        return list.isEmpty() ? new ArrayList<>() : listMapped;
    }

    @Override
    public String getDayOfMonth(LocalDateTime data) {
        return String.valueOf(data.getDayOfMonth());
    }

    @Override
    public String getDayOfWeek(LocalDateTime data) {
        return data.getDayOfWeek().toString();
    }

    @Override
    public String getEndHour(String schedule) {
        ScheduleConversor conversor = new ScheduleConversor(schedule);
        return conversor.getEndTime();
    }

    @Override
    public String getStartHour(String schedule) {
        ScheduleConversor conversor = new ScheduleConversor(schedule);
        return conversor.getStartTime();
    }

    
}
