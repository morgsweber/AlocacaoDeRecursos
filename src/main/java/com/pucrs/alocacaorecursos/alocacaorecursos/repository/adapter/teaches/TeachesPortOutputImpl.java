package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.teaches;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeachesPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.TeachesMapper;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.TeachesEntity;

@Repository
public class TeachesPortOutputImpl implements TeachesPortOutput {

    @Override
    public List<Teaches> getTeachesByLectureGroup(Integer lectureGroupId) {
        List<TeachesEntity> list = teachesRepository.findByGroupId(lectureGroupId);
        List<Teaches> listMapped = new ArrayList<>();

        listMapped = list.stream().map(item -> TeachesMapper.mapFrom(item)).collect(Collectors.toList());

        return list.isEmpty() ? new ArrayList<>() : listMapped;
    }

    @Autowired
    private TeachesBase teachesRepository;

    @Override
    public List<Teaches> getTeaches(Integer teacherId) {

        List<TeachesEntity> list = teachesRepository.findByTeacherId(teacherId);
        System.out.println("Id:"+ list.get(0));
        List<Teaches> listMapped = new ArrayList<>();

        listMapped = list.stream().map(item -> TeachesMapper.mapFrom(item)).collect(Collectors.toList());

        return list.isEmpty() ? new ArrayList<>() : listMapped;
    }
    
}
