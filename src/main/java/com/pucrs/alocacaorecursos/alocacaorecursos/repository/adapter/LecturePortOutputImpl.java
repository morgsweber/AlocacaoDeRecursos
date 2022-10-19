package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.LectureMapper;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureEntity;

@Repository
public class LecturePortOutputImpl implements LecturePortOutput {

    @Autowired
    private LectureBase repository;

    @Override
    public Lecture getLecture(String id) {
        Optional<LectureEntity> optional = repository.findById(id);

        if (optional.isEmpty()) {
            return null;
        }

        return LectureMapper.mapFrom(optional.get());
    }
    
}
