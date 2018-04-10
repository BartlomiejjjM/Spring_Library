package com.BartlomiejjjM.Spring_Library.library.application.book_category;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

@Service
public class BookCategoryService {

    private BookCategoryRepository repository;

    public BookCategoryService(BookCategoryRepository repository) {
        this.repository = repository;
    }

    public void createNewBookCategory (BookCategoryDTO bookCategoryDTO) {
        checkNotNull(bookCategoryDTO, "Book category cannot be null.");
        repository.save(BookCategoryMapper.toBookCategoryEntity(bookCategoryDTO));
    }
    public void removeBookCategory (BookCategoryDTO bookCategoryDTO) {
        checkNotNull(bookCategoryDTO, "Book category cannot be null.");
        repository.deleteById(BookCategoryMapper.toBookCategoryEntity(bookCategoryDTO).getCategoryCode());
    }
    public void editBookCategory (BookCategoryDTO bookCategoryDTO) {
        checkNotNull(bookCategoryDTO, "Book category cannot be null.");
        BookCategoryEntity newBookCategory;
        newBookCategory = BookCategoryMapper.toBookCategoryEntity(bookCategoryDTO);
        repository.save(newBookCategory);
    }
    public List<BookCategoryDTO> findAll(){
        return BookCategoryMapper.bookCategoryDTOList(repository.findAll());
    }
}
