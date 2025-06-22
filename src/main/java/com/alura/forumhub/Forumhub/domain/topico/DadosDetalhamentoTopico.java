package com.alura.forumhub.Forumhub.domain.topico;

import com.alura.forumhub.Forumhub.domain.curso.Curso;
import com.alura.forumhub.Forumhub.domain.resposta.DadosDetalhamentoResposta;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        String status,
        Curso nomeCurso,
        List<DadosDetalhamentoResposta> respostas
) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(),topico.getStatus(),topico.getCurso(),
                topico.getResposta().stream()
                        .map(DadosDetalhamentoResposta::new)
                        .collect(Collectors.toList()));
    }

}
