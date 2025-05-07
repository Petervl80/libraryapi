package com.github.petervl80.libraryapi.controller.dto;

public record ClientDTO(
        String clientId,
        String clientSecret,
        String redirectURI,
        String scope
) {
}
