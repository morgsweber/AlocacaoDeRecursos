package com.pucrs.alocacaorecursos.alocacaorecursos.business.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.AllRequestsView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.ClassroomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureGroupPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestChangePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeacherPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.TeacherRequest;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests.RequestDTO;

@Component
public class AllRequestsViewImpl implements AllRequestsView {
    
    @Autowired
    private RequestChangePortOutput requestPortOutput; 
    
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
        Integer requestId;

        allRequests = requestPortOutput.getAllRequests();

        for (TeacherRequest request : allRequests) {
            requestId = request.getRequestId();
            lectureName = lecturePortOutput.getLecture(request.getLectureId()).getName();
            teacherName = teacherPortOutput.getTeacher(request.getTeacherId()).getName();    
            lectureGroupId = String.valueOf(lectureGroupPortOutput.getLectureGroup(String.valueOf(request.getLectureGroupId())).getId());
            currentClassroom = classroomPortOutput.getClassRoom(Integer.valueOf(request.getCurrentClassroomId()));
            newClassroom = classroomPortOutput.getClassRoom(request.getNewLocation());   
            motive = request.getJustification();
            if (Objects.nonNull(newClassroom) && Objects.nonNull(currentClassroom)) {
                response.add(new RequestDTO(requestId, lectureName, teacherName, lectureGroupId,String.valueOf(currentClassroom.getId()), currentClassroom.getType(), String.valueOf(newClassroom.getId()),newClassroom.getType(), motive));
            }    
        }

        return response;
    }
    
}
