package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Objects;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teacher;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeacherEntity;

public class TeacherMapper {

    public static Teacher mapFrom(final TeacherEntity entity) {
        Teacher domain = new Teacher();
        if(Objects.nonNull(entity)) {
            domain.setId(entity.getId());
            domain.setName(entity.getName());
            domain.setAge(entity.getAge());
            domain.setCpf(entity.getCpf());
            domain.setArea(entity.getArea());
        }
        
        return domain;
    }
}
