package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.roomgroup;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.RoomGroupEntity;

public interface RoomGroupBase extends CrudRepository<RoomGroupEntity, Integer> {
    
}
