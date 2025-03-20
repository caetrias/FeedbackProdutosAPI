package com.caetrias.feedbackprodutosapi.usuario.impl;

import com.caetrias.feedbackprodutosapi.usuario.Usuario;
import com.caetrias.feedbackprodutosapi.usuario.UsuarioRepository;
import com.caetrias.feedbackprodutosapi.usuario.UsuarioService;
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
    public void atualizarUsuario(Usuario usuario) {
        // todo: implementar atualiarUsuario
    }

    @Override
    public void excluirUsuario(Long id) {
        // todo: implementar excluirUsuario
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}

