package com.github.petervl80.libraryapi.controller.mappers;

import com.github.petervl80.libraryapi.controller.dto.ClientDTO;
import com.github.petervl80.libraryapi.model.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client toEntity(ClientDTO dto);

    ClientDTO toDTO(Client client);
}
