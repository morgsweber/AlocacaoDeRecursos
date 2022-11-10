package com.pucrs.alocacaorecursos.alocacaorecursos.business.mappers;

import java.util.Objects;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.LectureDTO;

public class LectureDTOMapper {

    public static LectureDTO mapFrom(final Lecture lecture) {

        LectureDTO dto = LectureDTO
            .builder()
            .name(getNonNull(lecture.getName()))
            .content(getNonNull(lecture.getContent()))
            .build();

        return dto;
    }
    
    private static String getNonNull(final String item) {
        return Objects.nonNull(item) ? item : null;
    }
}
