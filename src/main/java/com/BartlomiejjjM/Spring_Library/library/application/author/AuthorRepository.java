package com.BartlomiejjjM.Spring_Library.library.application.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    List<AuthorEntity> findAllByName (String name);
    List<AuthorEntity> findAllBySurname (String surname);
}
