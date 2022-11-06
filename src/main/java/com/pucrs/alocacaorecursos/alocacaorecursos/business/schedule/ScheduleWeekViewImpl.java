package com.pucrs.alocacaorecursos.alocacaorecursos.business.schedule;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.ScheduleWeekView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.StudentPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureRoomPortOutput;

@Component
public class ScheduleWeekViewImpl implements ScheduleWeekView {

    @Autowired
    private LectureRoomPortOutput lectureRoomPortOutput;

    @Autowired
    private StudentPortOutput studentPortOutput;

    @Override
    public List<ScheduleWeekResponse> getListSchedule(final String studentId) {
        List<ScheduleWeekResponse> scheduleWeekResponses = new ArrayList<>();

        List<Integer> lectureGroups = studentPortOutput.getEnrolledClassesId(studentId);

        List<LectureRoom> rooms = new ArrayList<>();
        for (int i=0; i<lectureGroups.size(); i++){
            for(LectureRoom lr: lectureRoomPortOutput.findLectureRoomByLectureGroupId(lectureGroups.get(i))){
                rooms.add(lr);
            }
        }
            
       /*
       retorno precisa: 
            lecture - lectureGroups consulta LecturePortOutput (a partir de turma pega disciplina) precisa criar metodo p isso (getLectureByLectureGroup)
            building - rooms consulta ClassroomPortOutput
            classRoom - =rooms
            startHour - schedule de rooms
            endHour - schedule de rooms
            dayOfMonth - day em rooms
            dayOfWeek - alguma funcao aplicada em day de rooms
       */ 
       

        return scheduleWeekResponses;
    }
    
}
