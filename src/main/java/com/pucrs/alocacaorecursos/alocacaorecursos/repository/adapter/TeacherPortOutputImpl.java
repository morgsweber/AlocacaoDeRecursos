package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeacherPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teacher;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.TeacherMapper;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeacherEntity;

@Repository
public class TeacherPortOutputImpl implements TeacherPortOutput {

    @Autowired
    private TeacherBase repository;

    @Override
    public Teacher getTeacher(String id) {
        Optional<TeacherEntity> optional = repository.findById(id);

        if (optional.isEmpty()) {
            return null;
        }

        return TeacherMapper.mapFrom(optional.get());
    }
    
}
