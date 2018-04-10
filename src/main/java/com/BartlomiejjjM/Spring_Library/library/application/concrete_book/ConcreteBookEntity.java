package com.BartlomiejjjM.Spring_Library.library.application.concrete_book;

import com.BartlomiejjjM.Spring_Library.library.application.book.BookEntity;
import com.BartlomiejjjM.Spring_Library.library.application.hire.HireEntity;

import javax.persistence.*;

@Entity
@Table(name = "concretebook", catalog = "postgresql")
public class ConcreteBookEntity {

    @Id
    private Long catalog_number;

    @ManyToOne
    private BookEntity book;

    public ConcreteBookEntity(Long catalog_number, BookEntity book) {
        this.catalog_number = catalog_number;
        this.book = book;
    }

    public Long getCatalog_number() {
        return catalog_number;
    }

    public void setCatalog_number(Long catalog_number) {
        this.catalog_number = catalog_number;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }


}
