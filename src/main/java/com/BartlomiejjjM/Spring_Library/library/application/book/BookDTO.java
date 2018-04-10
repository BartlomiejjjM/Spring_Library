package com.BartlomiejjjM.Spring_Library.library.application.book;

import com.BartlomiejjjM.Spring_Library.library.application.book_category.BookCategoryDTO;
import com.BartlomiejjjM.Spring_Library.library.application.publishing_house.PublishingHouseDTO;

public class BookDTO {

    private Long id;

    private PublishingHouseDTO publishingHouseDTO;

    private BookCategoryDTO bookCategoryDTO;

    private String title;

    public BookDTO(Long id, PublishingHouseDTO publishingHouseDTO, BookCategoryDTO bookCategoryDTO, String title) {
        this.id = id;
        this.publishingHouseDTO = publishingHouseDTO;
        this.bookCategoryDTO = bookCategoryDTO;
        this.title = title;
    }
}
