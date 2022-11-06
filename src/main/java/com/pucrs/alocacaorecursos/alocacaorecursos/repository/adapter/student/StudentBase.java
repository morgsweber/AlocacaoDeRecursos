package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.StudentEntity;


public interface StudentBase extends CrudRepository<StudentEntity, String>{
    
}
