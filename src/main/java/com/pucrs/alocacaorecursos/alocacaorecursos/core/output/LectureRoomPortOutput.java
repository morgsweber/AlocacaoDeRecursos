package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;

public interface LectureRoomPortOutput {
    
    List<LectureRoom> findLectureRoomByLectureGroupId(final Integer id);
}
