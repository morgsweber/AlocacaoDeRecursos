package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.lecture;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureEntity;


public interface LectureBase extends CrudRepository<LectureEntity, Integer>{
    
}
