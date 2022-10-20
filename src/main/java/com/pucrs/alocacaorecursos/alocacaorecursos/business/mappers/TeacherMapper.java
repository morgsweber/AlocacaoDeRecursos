package com.pucrs.alocacaorecursos.alocacaorecursos.business.mappers;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teacher;

public class TeacherMapper {

    public static Teacher mapFrom(final Teacher Teacher) {

        Teacher dto = Teacher
            .builder()
            .name(Teacher.getName())
            .age(Teacher.getAge())
            .cpf(Teacher.getCpf())
            .area(Teacher.getArea())
            .build();

        return dto;
    }
    
}
