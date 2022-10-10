package com.pucrs.alocacaorecursos.alocacaorecursos.http;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/teste")
    public ResponseEntity testRoute() {
        System.out.println("requisicao ok");
        return ResponseEntity.ok().build();
    }
}
