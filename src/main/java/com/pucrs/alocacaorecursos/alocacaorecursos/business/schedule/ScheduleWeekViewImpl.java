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
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
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
    public List<ScheduleWeekResponse> getStudentListSchedule(final Integer id) {
        List<ScheduleWeekResponse> scheduleWeekResponses = new ArrayList<>();

        List<Integer> lectureGroupsIds = enrollPortOutput.getLectureGroupByStudentId(id);
        System.out.println("qtd turmas em q aluno ta matriculado"+ lectureGroupsIds.size());
        System.out.println("id das turmas: "+ lectureGroupsIds);

        for (Integer lectureGroupId: lectureGroupsIds){
            List<Teaches> lectureId = teachesPortOutput.getTeachesByLectureGroup(lectureGroupId); //verificar se vem mais de um, acredito que nao
            System.out.println("qtd lectureIds "+ lectureId.size() + "se >1 provavelmente errado");
            String lectureName = lecturePortOutput.getLectureName(lectureId.get(0).getDisciplinaId()); 

            List<LectureRoom> lectureRoom = lectureRoomPortOutput.findLectureRoomByLectureGroupId(lectureGroupId);

            for(LectureRoom lr: lectureRoom){
                ClassRoom classroom = classroomPortOutput.getClassRoom(lr.getRoomId());
                //building & classRoom
                String classroomId = String.valueOf(classroom.getId());
                String building = classroom.getBuilding();
                //startHour
                String startHour = lectureRoomPortOutput.getStartHour(lr.getScheduled());
                //endHour
                String endHour = lectureRoomPortOutput.getEndHour(lr.getScheduled());
                //dayOfMonth
                String dayOfMonth = lectureRoomPortOutput.getDayOfMonth(lr.getDay());
                //dayOfWeek
                String dayOfWeek = lectureRoomPortOutput.getDayOfWeek(lr.getDay());
                
                //add
                scheduleWeekResponses.add(new ScheduleWeekResponse(lectureName, building, classroomId, startHour, endHour, dayOfWeek, dayOfMonth));
            }

        }

        
        return scheduleWeekResponses;
    }
    
    @Override
    public List<ScheduleWeekResponse> getTeacherListSchedule(final Integer id) {
        List<ScheduleWeekResponse> scheduleWeekResponses = new ArrayList<>();

        List<Teaches> teaches = teachesPortOutput.getTeaches(id);
        for (Teaches t: teaches){
            System.out.println("ministra disciplinas " + t.getDisciplinaId());
            System.out.println("ministra turmas" + t.getGroupId());
            Integer lectureId = t.getDisciplinaId();
            Integer lectureGroupId = t.getGroupId();

            //lecture
            String lectureName = lecturePortOutput.getLectureName(lectureId);
            //lectureRoom
            List<LectureRoom> lectureRoom = lectureRoomPortOutput.findLectureRoomByLectureGroupId(lectureGroupId);
            System.out.println("total salas/dias "+ lectureRoom.size());

            for(LectureRoom lr: lectureRoom){
                ClassRoom classroom = classroomPortOutput.getClassRoom(lr.getRoomId());
                //building & classRoom
                String classroomId = String.valueOf(classroom.getId());
                String building = classroom.getBuilding();
                //startHour
                String startHour = lectureRoomPortOutput.getStartHour(lr.getScheduled());
                //endHour
                String endHour = lectureRoomPortOutput.getEndHour(lr.getScheduled());
                //dayOfMonth
                String dayOfMonth = lectureRoomPortOutput.getDayOfMonth(lr.getDay());
                //dayOfWeek
                String dayOfWeek = lectureRoomPortOutput.getDayOfWeek(lr.getDay());
                
                //add
                scheduleWeekResponses.add(new ScheduleWeekResponse(lectureName, building, classroomId, startHour, endHour, dayOfWeek, dayOfMonth));
            }
        }
        
        return scheduleWeekResponses;
    }
}
