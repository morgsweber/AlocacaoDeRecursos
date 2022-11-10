package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.business.mappers.LectureDTOMapper;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LecturePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.LectureDTO;

@RestController("/")
public class DefaultController {

    @Autowired
    private LecturePortOutput lecturePortOutput;

    @GetMapping("/lecture/{id}")
    public ResponseEntity<LectureDTO> getLectures(@PathVariable String id) {

        LectureDTO dto = LectureDTOMapper.mapFrom(lecturePortOutput.getLecture(Integer.parseInt(id)));

        System.out.println("requisicao ok");
        return ResponseEntity.ok().body(dto);
    }
}
