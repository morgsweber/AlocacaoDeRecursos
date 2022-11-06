package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.lecture_room;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureRoomEntity;

public interface LectureRoomBase extends CrudRepository<LectureRoomEntity, String> {
    
    @Query("SELECT * FROM turma_sala WHERE turma_id = ?1")
    List<LectureRoomEntity> findLectureRoomByLectureGroupId(final Integer id);
}
