package com.BartlomiejjjM.Spring_Library.library.application.book_category;

import java.util.List;
import java.util.stream.Collectors;

public class BookCategoryMapper {
    
    public static BookCategoryDTO toBookCategoryDTO (BookCategoryEntity bookCategoryEntity) {
        return new BookCategoryDTO(bookCategoryEntity.getCategoryCode(), bookCategoryEntity.getName());
    }
    public static BookCategoryEntity toBookCategoryEntity (BookCategoryDTO bookCategoryDTO) {
        return new BookCategoryEntity(bookCategoryDTO.getCategoryCode(), bookCategoryDTO.getName());
    }
    public static List <BookCategoryDTO> bookCategoryDTOList (List <BookCategoryEntity> bookCategoryEntityList) {
        return bookCategoryEntityList.stream()
                .map(BookCategoryMapper::toBookCategoryDTO)
                .collect(Collectors.toList());
    }
}
