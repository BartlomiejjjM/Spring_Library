package com.BartlomiejjjM.Spring_Library.library.application.book_category;

import com.BartlomiejjjM.Spring_Library.library.application.author.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategoryEntity, Long> {
}
