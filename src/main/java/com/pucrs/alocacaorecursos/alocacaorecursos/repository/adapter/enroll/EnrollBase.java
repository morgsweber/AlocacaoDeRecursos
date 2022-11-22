package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.enroll;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.EnrollEntity;


import java.util.List;

public interface EnrollBase extends CrudRepository<EnrollEntity, Integer>{

    List<EnrollEntity> findByStudentId(final Integer studentId);

}