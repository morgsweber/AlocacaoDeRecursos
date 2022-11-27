package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.AllRequestsView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase.RequestClassroomExchange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests.RequestDTO;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.requests.ResponseResultDTO;

@RestController
@RequestMapping("/gestor")
public class ManagerController {

    @Autowired
    private AllRequestsView allRequestsView;

    @Autowired
    private RequestClassroomExchange requestClassroomExchange;
 
    @GetMapping("/turmas")
    public ResponseEntity gestorTurmas() {

        List<RequestDTO> response = allRequestsView.getListRequests();

        return !response.isEmpty() ? ResponseEntity.ok().body(response) : ResponseEntity.notFound().build();
    }

    @PostMapping("/turmas/aprova")
    public ResponseEntity gestorTurmasAprova(@RequestParam Integer requestId, @RequestBody Map<String, String> status) {
        
        Optional<ResponseResultDTO> response = requestClassroomExchange.approveRequest(requestId, status.get("status"));
        
        return response.isPresent() ? ResponseEntity.status(HttpStatus.CREATED).body(response) : ResponseEntity.badRequest().build();
    }
}