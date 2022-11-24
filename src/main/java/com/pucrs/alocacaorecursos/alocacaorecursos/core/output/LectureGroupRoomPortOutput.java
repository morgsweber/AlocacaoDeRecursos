package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroupRoom;

public interface LectureGroupRoomPortOutput { 
    
    List<LectureGroupRoom> getLectureGroupRoom(final String groupId);
}
