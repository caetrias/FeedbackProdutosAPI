package com.caetrias.feedbackprodutosapi.usuario.impl;

import com.caetrias.feedbackprodutosapi.usuario.Usuario;
import com.caetrias.feedbackprodutosapi.usuario.UsuarioRepository;
import com.caetrias.feedbackprodutosapi.usuario.UsuarioService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void cadastrarUsuario(Usuario usuario) {
        // todo: aqui poderiam ter regras de negocio para verificar entradas e manter a seguranca da app
        usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void atualizarUsuario(Usuario usuario) {
        Usuario usuarioAtual = usuarioRepository.findById(usuario.getId()).orElseThrow(
                () -> new RuntimeException("Usuário com ID " + usuario.getId() + " não encontrado"));

        // Atualiza apenas os campos necessários (caso apenas .save fosse implementado, outros atributos nao citados seriam substituidos por null)
        usuarioAtual.setNome(usuario.getNome());
        usuarioAtual.setEmail(usuario.getEmail());
        // todo: ponto de melhora -> verificar o corpo da requisicao para atualizar o que foi requerido

        usuarioRepository.save(usuarioAtual);
    }

    @Override
    public void excluirUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}

