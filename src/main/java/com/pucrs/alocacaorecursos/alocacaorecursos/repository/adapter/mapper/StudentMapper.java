package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.Objects;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Student;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.StudentEntity;

public class StudentMapper {

    public static Student mapFrom(final StudentEntity entity) {
        Student domain = new Student();

        if(Objects.nonNull(entity)) {
            domain.setId(entity.getId());
            domain.setName(entity.getName());
            domain.setAge(entity.getAge());
            domain.setCpf(entity.getCpf());
            domain.setCourse(entity.getCourse());
            domain.setSemester(entity.getSemester());
        }
        
        return domain;
    }
}
