package com.github.petervl80.libraryapi.controller.mappers;

import com.github.petervl80.libraryapi.controller.dto.UsuarioDTO;
import com.github.petervl80.libraryapi.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO dto);

    UsuarioDTO toDTO(Usuario usuario);
}
