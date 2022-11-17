package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.classroom;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.ClassRoomEntity;

public interface ClassRoomBase extends CrudRepository<ClassRoomEntity, Integer>{
    //ClassRoomEntity findById(Integer id);
}
