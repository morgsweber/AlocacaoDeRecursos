package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.enroll;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.EnrollEntity;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnrollBase extends CrudRepository<EnrollEntity, Integer>{

    @Query("SELECT turma_id FROM turma_aluno WHERE aluno_id = ?1")
    List<Integer> findLectureGroupByStudentId(final Integer id);

}