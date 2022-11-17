package com.pucrs.alocacaorecursos.alocacaorecursos.business.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.AllRequestsView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.ClassroomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureGroupPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeacherPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.TeacherRequest;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests.RequestDTO;

public class AllRequestsViewImpl implements AllRequestsView {
    @Autowired
    private RequestPortOutput requestPortOutput; 
    
    @Autowired
    private TeacherPortOutput teacherPortOutput;//teacher

    @Autowired
    private ClassroomPortOutput classroomPortOutput;

    @Autowired
    private LecturePortOutput lecturePortOutput;//ok
    
    @Autowired
    private LectureGroupPortOutput lectureGroupPortOutput;//ok

    @Override
    public List<RequestDTO> getListRequests() {
        List<TeacherRequest> allRequests;
        List<RequestDTO> response = new ArrayList<>();
        String lectureName;
        String teacherName;
        String lectureGroupId;
        String motive; 
        ClassRoom currentClassroom;
        ClassRoom newClassroom;

        allRequests = requestPortOutput.getAllRequests();

        for (TeacherRequest request : allRequests) {
            lectureName = lecturePortOutput.getLecture(request.getLectureId()).getName();
            teacherName = teacherPortOutput.getTeacher(String.valueOf(request.getTeacherId())).getName();    
            lectureGroupId = String.valueOf(lectureGroupPortOutput.getLectureGroup(String.valueOf(request.getLectureGroupId())).getId());
            currentClassroom = classroomPortOutput.getClassroom(String.valueOf(request.getCurrentClassroomId()));
            newClassroom = classroomPortOutput.getClassroom(String.valueOf(request.getNewLocation()));   
            motive = request.getJustification();
            if (Objects.nonNull(newClassroom) && Objects.nonNull(currentClassroom)) {
                response.add(new RequestDTO(lectureName, teacherName, lectureGroupId,String.valueOf(currentClassroom.getId()), currentClassroom.getType(), String.valueOf(newClassroom.getId()),newClassroom.getType(), motive));
            }    
        }

        return response;
    }
    
}
