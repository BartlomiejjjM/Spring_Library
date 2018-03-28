package com.BartlomiejjjM.Spring_Library.library.application.book_category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "bookcategory", catalog = "postgresql")
public class BookCategoryEntity {
    @Id
    @Size(min=4, max=4)
    private int categoryCode;
    private String name;

    public BookCategoryEntity(@Size(min = 4, max = 4) int categoryCode, String name) {
        this.categoryCode = categoryCode;
        this.name = name;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
