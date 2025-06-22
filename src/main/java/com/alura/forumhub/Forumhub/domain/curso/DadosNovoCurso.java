package com.alura.forumhub.Forumhub.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DadosNovoCurso(
        @NotBlank
        String nome,
        @NotBlank
        String categoria) {

}
