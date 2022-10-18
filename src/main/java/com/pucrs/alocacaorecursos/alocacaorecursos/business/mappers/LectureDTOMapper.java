package com.pucrs.alocacaorecursos.alocacaorecursos.business.mappers;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.LectureDTO;

public class LectureDTOMapper {

    public static LectureDTO mapFrom(final Lecture lecture) {

        LectureDTO dto = LectureDTO
            .builder()
            .name(lecture.getName())
            .content(lecture.getContent())
            .build();

        return dto;
    }
    
}
