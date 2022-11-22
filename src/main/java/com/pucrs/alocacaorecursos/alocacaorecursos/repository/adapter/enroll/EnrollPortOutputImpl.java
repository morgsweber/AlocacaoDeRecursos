package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.enroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.EnrollPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.EnrollEntity;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnrollPortOutputImpl implements EnrollPortOutput {

    @Autowired
    private EnrollBase enrollRepository;

    @Override
    public List<Integer> getLectureGroupByStudentId(Integer studentId){

        List<EnrollEntity> enroll = enrollRepository.findByStudentId(studentId);

        List<Integer> list = new ArrayList<>();
        for (EnrollEntity e: enroll){
            list.add(e.getLectureGroupId());
        }
        return list;
    }
}
