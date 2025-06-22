package com.alura.forumhub.Forumhub.domain.resposta;

import com.alura.forumhub.Forumhub.domain.usuario.Usuario;

public record DadosDetalheRespostaUsuario(
        Long id,
        String nome
) {

    public DadosDetalheRespostaUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome());
    }
}
