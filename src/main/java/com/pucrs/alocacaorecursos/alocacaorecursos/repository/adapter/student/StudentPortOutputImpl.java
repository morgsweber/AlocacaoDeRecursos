package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.StudentPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Student;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.StudentBase;

public class StudentPortOutputImpl implements StudentPortOutput {

    @Autowired
    private StudentBase studentRepository;

    @Override
    public List<String> getEnrolledClassesId(String studentId){
        // como q faz p buscar as turmas q aluno ta matriculado??
        return null;
    }
}
