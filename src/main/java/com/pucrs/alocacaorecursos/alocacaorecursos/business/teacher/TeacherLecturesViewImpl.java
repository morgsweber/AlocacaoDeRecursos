package com.pucrs.alocacaorecursos.alocacaorecursos.business.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureGroupPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeacherPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeachesPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroup;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teacher;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

@Component
public class TeacherLecturesViewImpl implements TeacherLecturesView {

    @Autowired
    private TeachesPortOutput teachesPortOutput;

    @Autowired
    private LecturePortOutput lecturePortOutput;

    @Autowired
    private TeacherPortOutput teacherPortOutput;

    @Autowired
    private LectureGroupPortOutput lectureGroupPortOutput;

    int index = 0;
    
    @Override
    public List<TeacherLecturesResponse> getTeacherLectures(String teacherId) {

        final List<Teaches> teaches = teachesPortOutput.getTeaches(teacherId);

        final Teacher teacher = teacherPortOutput.getTeacher(teacherId);

        final List<TeacherLecturesResponse> response = new ArrayList();
        
        index = teaches.size()-1;

        teaches.forEach(item -> {            

            final Integer lectureId = teaches.get(getIndex(index)).getDisciplinaId();
            final Integer lectureGroupId = teaches.get(getIndex(index)).getGroupId();

            final LectureGroup lecturegroup = lectureGroupPortOutput.getLectureGroup(String.valueOf(lectureGroupId));
            final Lecture lecture = lecturePortOutput.getLecture(lectureId);
            
            if(Objects.nonNull(lecture) && Objects.nonNull(lecturegroup)) {

                response.add(new TeacherLecturesResponse(lecture.getName(),teacher.getName(),lecturegroup.getId()));

            }           

            index--;

        });
        
        return response;
    }

    private int getIndex(int length) {
        return length <= 0 ? 0 : length;
    }
    
}
    