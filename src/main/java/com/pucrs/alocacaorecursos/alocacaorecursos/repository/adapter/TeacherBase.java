package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeacherEntity;


public interface TeacherBase extends CrudRepository<TeacherEntity, String>{
    
}
