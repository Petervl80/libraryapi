package com.github.petervl80.libraryapi.controller.mappers;

import com.github.petervl80.libraryapi.controller.dto.UsuarioDTO;
import com.github.petervl80.libraryapi.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-06T16:48:51-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setLogin( dto.login() );
        usuario.setSenha( dto.senha() );
        usuario.setEmail( dto.email() );
        List<String> list = dto.roles();
        if ( list != null ) {
            usuario.setRoles( new ArrayList<String>( list ) );
        }

        return usuario;
    }

    @Override
    public UsuarioDTO toDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        String login = null;
        String senha = null;
        String email = null;
        List<String> roles = null;

        login = usuario.getLogin();
        senha = usuario.getSenha();
        email = usuario.getEmail();
        List<String> list = usuario.getRoles();
        if ( list != null ) {
            roles = new ArrayList<String>( list );
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO( login, senha, email, roles );

        return usuarioDTO;
    }
}
