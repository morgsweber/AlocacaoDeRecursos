package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.lecture;


import java.util.*;
import org.springframework.data.repository.CrudRepository;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureEntity;


public interface LectureBase extends CrudRepository<LectureEntity, Integer>{
    


    //LectureEntity findById(Integer id);
}
