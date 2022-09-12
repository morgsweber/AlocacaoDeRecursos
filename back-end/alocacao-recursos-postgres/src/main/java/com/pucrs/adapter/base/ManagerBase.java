package com.pucrs.adapter.base;

import com.pucrs.entities.ManagerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ManagerBase extends CrudRepository<ManagerEntity, UUID> {

}
