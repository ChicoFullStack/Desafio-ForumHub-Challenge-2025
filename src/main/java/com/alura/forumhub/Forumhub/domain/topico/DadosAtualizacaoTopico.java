package com.alura.forumhub.Forumhub.domain.topico;

import com.alura.forumhub.Forumhub.domain.curso.Curso;
import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoTopico(
        @NotBlank
        Long id,
        String titulo,
        String mensagem,
        Curso nomeCurso) {
}
