package com.github.petervl80.libraryapi.repository;

import com.github.petervl80.libraryapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    Client findByClientId(String clientId);
}
