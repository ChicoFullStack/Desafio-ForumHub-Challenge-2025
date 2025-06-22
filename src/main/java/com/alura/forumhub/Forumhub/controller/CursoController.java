package com.alura.forumhub.Forumhub.controller;


import com.alura.forumhub.Forumhub.domain.curso.CursoService;
import com.alura.forumhub.Forumhub.domain.curso.DadosAualizacaoCurso;
import com.alura.forumhub.Forumhub.domain.curso.DadosDetalhamentoCurso;
import com.alura.forumhub.Forumhub.domain.curso.DadosNovoCurso;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@SecurityRequirement(name = "bearer-key")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @PostMapping
    @Transactional
    public ResponseEntity<DadosDetalhamentoCurso> cadastraCurso(@RequestBody @Valid DadosNovoCurso dados) {
        return ResponseEntity.ok(cursoService.cadasroCurso(dados));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DadosDetalhamentoCurso> atualizaCurso(@RequestBody @Valid DadosAualizacaoCurso dados) {
        return ResponseEntity.ok(cursoService.atualizaCurso(dados));
    }

    @GetMapping
    public ResponseEntity<List<DadosDetalhamentoCurso>> listaCurso() {
        List<DadosDetalhamentoCurso> listaCurso = cursoService.listaCursos();
        return ResponseEntity.ok(listaCurso);
    }

}

