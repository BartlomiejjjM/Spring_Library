package com.BartlomiejjjM.Spring_Library.library.application.book_category;

import com.BartlomiejjjM.Spring_Library.library.application.author.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<AuthorEntity, Long> {
}
