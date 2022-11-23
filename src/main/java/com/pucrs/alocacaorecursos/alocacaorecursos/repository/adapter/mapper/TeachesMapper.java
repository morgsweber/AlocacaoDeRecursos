package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Objects;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeachesEntity;

public class TeachesMapper {
    
    public static Teaches mapFrom(final TeachesEntity entity) {
        Teaches domain = new Teaches();

        if(Objects.nonNull(entity)) {
            domain.setTeacherId(getNonNull(entity.getTeacherId()));
            domain.setDisciplinaId(getNonNull(entity.getDisciplinaId()));
            domain.setGroupId(getNonNull(entity.getGroupId()));
        }

        return domain;
    }

    private static Integer getNonNull(final Integer item) {
        return Objects.nonNull(item) ? item : null;
    }
}
