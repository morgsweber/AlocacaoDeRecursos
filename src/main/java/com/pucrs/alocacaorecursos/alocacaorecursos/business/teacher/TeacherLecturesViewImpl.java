package com.pucrs.alocacaorecursos.alocacaorecursos.business.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeachesPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

@Component
public class TeacherLecturesViewImpl implements TeacherLecturesView {

    @Autowired
    private TeachesPortOutput teachesPortOutput;

    @Autowired
    private LecturePortOutput lecturePortOutput;
    
    @Override
    public List<TeacherLecturesResponse> getTeacherLectures(Integer teacherId) {

        //TODO adicionar comportamento de percorrer itens para montar responses
        final List<Teaches> teaches = teachesPortOutput.getTeaches(teacherId);
        final Integer lectureId = teaches.get(0).getDisciplinaId(); //Ver uma forma de pegar os id da lista retornada para realizar a busca na tabela disciplinas
        final Lecture lecture = lecturePortOutput.getLecture(lectureId);

        System.out.println("Id:" + lecture.getId());

        final List<TeacherLecturesResponse> response = new ArrayList();

        teaches.forEach(item -> response.add(new TeacherLecturesResponse(lecture.getName(),null,null)));
        
        return response;
    }
    
}
