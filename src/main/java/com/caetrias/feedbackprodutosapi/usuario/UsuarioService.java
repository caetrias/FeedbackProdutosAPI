package com.caetrias.feedbackprodutosapi.usuario;

import java.util.List;

public interface UsuarioService {

    public void cadastrarUsuario(Usuario usuario);
    public void atualizarUsuario(Usuario usuario);
    public void excluirUsuario(Long id);
    public List<Usuario> listarUsuarios();

    public Usuario buscarUsuarioPorId(Long id);
    public Usuario buscarUsuarioPorEmail(String email);

    //todo: metodo para listar feedbacks do usuario
}
