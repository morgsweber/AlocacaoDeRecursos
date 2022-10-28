package com.pucrs.alocacaorecursos.alocacaorecursos.business.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeachesPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

public class TeacherLecturesViewImpl implements TeacherLecturesView {

    @Autowired
    private TeachesPortOutput teachesPortOutput;

    @Autowired
    private LecturePortOutput lecturePortOutput;
    
    @Override
    public List<TeacherLecturesResponse> getTeacherLectures(String teacherId) {
        final List<Teaches> teaches = teachesPortOutput.getTeaches(teacherId);
        final Lecture lecture = lecturePortOutput.getLecture(teaches.get(0).getDisciplinaId());

        System.out.println(lecture.getName());
        
        return null;
    }
    
}
