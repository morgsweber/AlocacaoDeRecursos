package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Objects;
import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroup;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureGroupEntity;

public class LectureGroupMapper {

    public static LectureGroup mapFrom(final Optional<LectureGroupEntity> optional) {

        LectureGroup domain = new LectureGroup();

        if(optional.isPresent()) {
            domain.setId(getNonNull(optional.get().getId()));
        }
        return domain;
    }

    private static Integer getNonNull(final Integer item) {
        return Objects.nonNull(item) ? item : null;
    }
    
}
