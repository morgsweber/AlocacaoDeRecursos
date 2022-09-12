package com.pucrs.adapter.base;

import com.pucrs.entities.TeacherEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherBase extends CrudRepository<TeacherEntity, UUID> {
}
