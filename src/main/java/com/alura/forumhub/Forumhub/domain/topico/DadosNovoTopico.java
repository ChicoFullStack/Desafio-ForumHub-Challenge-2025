package com.alura.forumhub.Forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosNovoTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String nomeCurso) {
}

