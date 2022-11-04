package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.lecturegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureGroupPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroup;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.LectureGroupMapper;

@Repository
public class LectureGroupPortOutputImpl implements LectureGroupPortOutput {

    @Autowired
    private LectureGroupBase lectureGroupBase;

    @Override
    public LectureGroup getLectureGroup(String id) {
        return LectureGroupMapper.mapFrom(lectureGroupBase.findById(id));
    }
    
}
