package com.github.petervl80.libraryapi.validator;

import com.github.petervl80.libraryapi.exceptions.RegistroDuplicadoException;
import com.github.petervl80.libraryapi.model.Autor;
import com.github.petervl80.libraryapi.repository.AutorRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AutorValidator {

    private AutorRepository repository;

    public AutorValidator(AutorRepository repository) {
        this.repository = repository;
    }

    public void validar(Autor autor) {
        if(existeAutorCadastrado(autor)) {
            throw new RegistroDuplicadoException("Autor já cadastrado!");
        }
    }

    private boolean existeAutorCadastrado(Autor autor) {
        Optional<Autor> autorEncontrado = repository.findByNomeAndDataNascimentoAndNacionalidade(
                autor.getNome(),  autor.getDataNascimento(), autor.getNacionalidade());

        if(autor.getId() == null) {
            return autorEncontrado.isPresent();
        }

        return autorEncontrado.isPresent() && !autor.getId().equals(autorEncontrado.get().getId());
    }
}
