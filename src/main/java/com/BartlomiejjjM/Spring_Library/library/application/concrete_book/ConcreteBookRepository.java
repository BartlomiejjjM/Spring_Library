package com.BartlomiejjjM.Spring_Library.library.application.concrete_book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteBookRepository extends JpaRepository<ConcreteBookEntity, Long> {
}
