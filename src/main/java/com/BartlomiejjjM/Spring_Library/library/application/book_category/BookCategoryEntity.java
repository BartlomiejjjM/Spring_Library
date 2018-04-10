package com.BartlomiejjjM.Spring_Library.library.application.book_category;

import com.BartlomiejjjM.Spring_Library.library.application.book.BookEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "bookcategory", catalog = "postgresql")
public class BookCategoryEntity {
    @Id
    @Size(min=4, max=4)
    private Long categoryCode;
    private String name;

    public BookCategoryEntity(){

    }

    public BookCategoryEntity(@Size(min = 4, max = 4) Long categoryCode, String name) {
        this.categoryCode = categoryCode;
        this.name = name;
    }

    public Long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Long categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
