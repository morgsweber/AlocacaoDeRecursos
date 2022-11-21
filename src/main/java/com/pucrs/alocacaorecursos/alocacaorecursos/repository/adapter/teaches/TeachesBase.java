package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.teaches;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeachesEntity;

public interface TeachesBase extends CrudRepository<TeachesEntity, Integer> {
    
    List<TeachesEntity> findByTeacherId(final Integer id);

    TeachesEntity findByLectureGroupId(final Integer id);
}
