package com.pucrs.adapter.base;

import com.pucrs.entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface StudentBase extends CrudRepository<StudentEntity, UUID> {
}
