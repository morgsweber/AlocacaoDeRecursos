package com.pucrs.alocacaorecursos.alocacaorecursos.business.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherClassesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.ClassroomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureGroupPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureGroupRoomPortOutput;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeacherPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeachesPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroup;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroupRoom;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teacher;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherClassesResponse; 
@Component
public class TeacherClassesViewImpl implements TeacherClassesView {

    @Autowired
    private TeachesPortOutput teachesPortOutput;

    @Autowired
    private LecturePortOutput lecturePortOutput; 

    @Autowired
    private ClassroomPortOutput classroomPortOutput;
    
    @Autowired
    private LectureGroupRoomPortOutput LectureGroupRoomPortOutput;

    int index = 0;
    
    @Override
    public List<TeacherClassesResponse> getTeacherLectures(String lectureGroupId) {

        List<TeacherClassesResponse> response = new ArrayList();
        final Teaches t= teachesPortOutput.getTeachesByLectureGroup(lectureGroupId);

        final Lecture l = lecturePortOutput.getLecture(t.getDisciplinaId());

        final List<LectureGroupRoom> lectureGroupRooms = LectureGroupRoomPortOutput.getLectureGroupRoom(lectureGroupId);
       
        for(int i=0; i<lectureGroupRooms.size();i++){
            LectureGroupRoom lgr = lectureGroupRooms.get(i);

            ClassRoom cr = classroomPortOutput.getClassroom(lgr.getRoomId().toString());
            response.add(new TeacherClassesResponse(lgr.getDay(),lgr.getDescription(),
           cr.getBuilding() + "/"+  cr.getId().toString(),l.getName(),lectureGroupId));

        }
         
        return response;
    }

    
    
}
