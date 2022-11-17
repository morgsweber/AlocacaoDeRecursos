package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.enroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.EnrollPortOutput;

import java.util.List;

@Repository
public class EnrollPortOutputImpl implements EnrollPortOutput {

    @Autowired
    private EnrollBase enrollRepository;

    @Override
    public List<Integer> getLectureGroupByStudentId(Integer studentId){

        List<Integer> list = enrollRepository.findLectureGroupByStudentId(studentId);
        return list;
    }
}
