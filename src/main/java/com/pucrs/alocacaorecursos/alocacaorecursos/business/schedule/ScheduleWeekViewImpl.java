package com.pucrs.alocacaorecursos.alocacaorecursos.business.schedule;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.ScheduleWeekView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.ClassroomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.EnrollPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureRoomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeachesPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;


@Component
public class ScheduleWeekViewImpl implements ScheduleWeekView {

    @Autowired
    private LectureRoomPortOutput lectureRoomPortOutput;

    @Autowired
    private TeachesPortOutput teachesPortOutput;

    @Autowired 
    private LecturePortOutput lecturePortOutput;

    @Autowired
    private EnrollPortOutput enrollPortOutput;
    
    @Autowired
    private ClassroomPortOutput classroomPortOutput;

    @Override
    public List<ScheduleWeekResponse> getListSchedule(final Integer studentId) {
        List<ScheduleWeekResponse> scheduleWeekResponses = new ArrayList<>();

        List<Integer> lectureGroupsIds = enrollPortOutput.getLectureGroupByStudentId(studentId);

        for (Integer lectureGroupId: lectureGroupsIds){
            //ScheduleWeekResponse scheduleWeek = new ScheduleWeekResponse();
            //lecture
            String lectureName = lecturePortOutput.getLectureName(lectureGroupId); 
            //scheduleWeek.setLecture(lectureName);

            List<LectureRoom> lectureRoom = lectureRoomPortOutput.findLectureRoomByLectureGroupId(lectureGroupId);

            //scheduleWeek.setClassRoom(classroom.getId());
            //scheduleWeek.setBuilding(classroom.getBuilding());

            for(LectureRoom lr: lectureRoom){
                ClassRoom classroom = classroomPortOutput.getClassRoom(lr.getRoomId());
                //building & classRoom
                String classroomId = String.valueOf(classroom.getId());
                String building = classroom.getBuilding();
                //startHour
                String startHour = lectureRoomPortOutput.getStartHour(lr.getScheduled());
                //scheduleWeek.setStartHour(lectureRoomPortOutput.getStartHour(lr.getScheduled()));
                //endHour
                String endHour = lectureRoomPortOutput.getEndHour(lr.getScheduled());
                //scheduleWeek.setEndHour(lectureRoomPortOutput.getEndHour(lr.getScheduled()));
                //dayOfMonth
                String dayOfMonth = lectureRoomPortOutput.getDayOfMonth(lr.getDay());
                //scheduleWeek.setDayOfMonth(lectureRoomPortOutput.getDayOfMonth(lr.getDay()));
                //dayOfWeek
                String dayOfWeek = lectureRoomPortOutput.getDayOfWeek(lr.getDay());
                //scheduleWeek.setDayOfWeek(lectureRoomPortOutput.getDayOfWeek(lr.getDay()));
                
                //add
                scheduleWeekResponses.add(new ScheduleWeekResponse(lectureName, building, classroomId, startHour, endHour, dayOfWeek, dayOfMonth));
            }

        }

        
        return scheduleWeekResponses;
    }
    
}
