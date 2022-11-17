package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.student;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.StudentEntity;


public interface StudentBase extends CrudRepository<StudentEntity, Integer>{
    
}
