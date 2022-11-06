package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.StudentPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Student;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.StudentBase;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.enroll.EnrollBase;

public class StudentPortOutputImpl implements StudentPortOutput {

    @Autowired
    private StudentBase studentRepository;

    @Autowired
    private EnrollBase enrollRepository;

    @Override
    public List<Integer> getEnrolledClassesId(String studentId){

        List<Integer> list = enrollRepository.findLectureGroupByStudentId(Integer.parseInt(studentId));
        return list;
    }
}
