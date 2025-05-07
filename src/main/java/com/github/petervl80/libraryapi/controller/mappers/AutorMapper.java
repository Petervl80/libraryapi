package com.github.petervl80.libraryapi.controller.mappers;

import com.github.petervl80.libraryapi.controller.dto.AutorDTO;
import com.github.petervl80.libraryapi.model.Autor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutorMapper {

    Autor toEntity(AutorDTO dto);

    AutorDTO toDTO(Autor autor);
}
