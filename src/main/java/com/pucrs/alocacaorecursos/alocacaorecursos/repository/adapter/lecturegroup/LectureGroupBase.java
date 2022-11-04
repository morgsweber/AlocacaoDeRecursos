package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.lecturegroup;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureGroupEntity;

public interface LectureGroupBase extends CrudRepository<LectureGroupEntity, String> {
    
}
