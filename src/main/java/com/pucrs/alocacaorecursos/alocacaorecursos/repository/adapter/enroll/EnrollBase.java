package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.enroll;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.EnrollEntity;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.EnrollId;

public interface EnrollBase extends CrudRepository<EnrollEntity, EnrollId>{

    @Query("SELECT * FROM turma_aluno WHERE aluno_id = ?1")
    List<Integer> findLectureGroupByStudentId(final Integer id);

}