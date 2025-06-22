package com.alura.forumhub.Forumhub.domain.resposta;

import java.time.LocalDateTime;

public record DadosDetalhamentoResposta(
        Long id,
        String mensagem,
        LocalDateTime dataCriacao,
        DadosDetalheRespostaUsuario usuario
) {

    public DadosDetalhamentoResposta(Resposta resposta) {
        this(resposta.getId(),
                resposta.getMensagem(),
                resposta.getDatacriacao(),
                new DadosDetalheRespostaUsuario(resposta.getAutor()));
    }
}
