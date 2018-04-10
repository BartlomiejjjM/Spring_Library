package com.BartlomiejjjM.Spring_Library.library.application.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.google.common.base.Preconditions.checkNotNull;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addNewAuthor (AuthorDTO authorDTO) {
        checkNotNull(authorDTO, "Author cannot be null");
        authorRepository.save(AuthorMapper.toAuthorEntity(authorDTO));
    }
    public void removeAuthor (AuthorDTO authorDTO) {
        checkNotNull(authorDTO, "Author cannot be null");
        authorRepository.deleteById(AuthorMapper.toAuthorEntity(authorDTO).getId());
    }
    public Optional<AuthorDTO> findOne (Long playerId) {
        return authorRepository.findById(playerId).map(AuthorMapper::toAuthorDTO);
    }
    public List<AuthorDTO> findAll() {
        return AuthorMapper.toAuthorDTOList(authorRepository.findAll());
    }

    public List <AuthorDTO> findAllByName (AuthorDTO authorDTO) {
        String name = authorDTO.getName();
        return AuthorMapper.toAuthorDTOList(authorRepository.findAllByName(name));
    }
    public List <AuthorDTO> findAllBySurname (AuthorDTO authorDTO) {
        String surname = authorDTO.getSurname();
        return AuthorMapper.toAuthorDTOList(authorRepository.findAllBySurname(surname));
    }
}


