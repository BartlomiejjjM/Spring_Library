package com.BartlomiejjjM.Spring_Library.library.application.book_category;

public class BookCategoryDTO {
    
    private Long categoryCode;
    
    private String name;

    public BookCategoryDTO(Long categoryCode, String name) {
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
