package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.StudentPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.enroll.EnrollBase;


public class StudentPortOutputImpl implements StudentPortOutput {

    @Autowired
    private StudentBase studentRepository;

    @Autowired
    private EnrollBase enrollRepository;

    @Override
    public List<Integer> getEnrolledClassesId(Integer studentId){

        List<Integer> list = enrollRepository.findLectureGroupByStudentId(studentId);
        return list;
    }
}
