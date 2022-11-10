package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.teacher;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeacherEntity;

public interface TeacherBase extends CrudRepository<TeacherEntity, Integer>{
    
}
