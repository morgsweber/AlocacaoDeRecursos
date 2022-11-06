package com.pucrs.alocacaorecursos.alocacaorecursos.business.lectures;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase.LecturesUserView;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.lecture_timeline.LectureScheduleDTO;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.lecture_view.LectureViewDTO;

public class LectureUserViewImpl implements LecturesUserView{

    @Override
    public List<ScheduleWeekResponse> getAllWeeklyLecturesSchedules(String userId, String startWeek, String endWeek) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<LectureViewDTO> getAllLectures(String userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<LectureScheduleDTO> getOneLectureSchedule(String lectureId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
