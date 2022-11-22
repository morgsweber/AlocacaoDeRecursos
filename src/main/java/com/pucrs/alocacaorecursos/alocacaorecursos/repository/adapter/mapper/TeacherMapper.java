package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Objects;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teacher;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeacherEntity;

public class TeacherMapper {
    
    public static Teacher mapFrom(final TeacherEntity entity) {

        Teacher domain = new Teacher();

        if(Objects.nonNull(entity)) {
            domain.setId(getNonNull(entity.getId()));
            domain.setName(getNonNull(entity.getName()));
        }
        return domain;
    }

    private static String getNonNull(final String item) {
        return Objects.nonNull(item) ? item : null;
    }

    private static Integer getNonNull(final Integer item) {
        return Objects.nonNull(item) ? item : null;
    }
}
