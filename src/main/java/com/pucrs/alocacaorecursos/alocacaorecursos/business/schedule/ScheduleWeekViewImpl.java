package com.pucrs.alocacaorecursos.alocacaorecursos.business.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.ScheduleWeekView;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureRoomPortOutput;

@Component
public class ScheduleWeekViewImpl implements ScheduleWeekView {

    @Autowired
    private LectureRoomPortOutput lectureRoomPortOutput;

    @Override
    public List<ScheduleWeekResponse> getListSchedule(final String studentId) {
        List<LectureRoom> rooms = lectureRoomPortOutput.findLectureRoomByLectureGroupId(null);
        
        // TODO Auto-generated method stub
        return null;
    }
    
}
