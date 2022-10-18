package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Objects;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureEntity;

public class LectureMapper {

    private String id;
    private String name;
    private String content;

    public static Lecture mapFrom(final LectureEntity entity) {
        Lecture domain = new Lecture();

        if(Objects.nonNull(entity)) {
            domain.setId(entity.getId());
            domain.setName(entity.getName());
            domain.setContent(entity.getContent());
        }
        
        return domain;
    }
}
