package com.BartlomiejjjM.Spring_Library.library.application.book;

import com.BartlomiejjjM.Spring_Library.library.application.author.AuthorEntity;
import com.BartlomiejjjM.Spring_Library.library.application.book_category.BookCategoryEntity;
import com.BartlomiejjjM.Spring_Library.library.application.concrete_book.ConcreteBookEntity;
import com.BartlomiejjjM.Spring_Library.library.application.publishing_house.PublishingHouseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "book" , catalog = "postgresql")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    @ManyToOne
    private PublishingHouseEntity publishingHouseEntity;
    @NotNull
    @ManyToOne
    private BookCategoryEntity bookCategoryEntity;
    @NotNull
    private String title;
    @ManyToMany(mappedBy = "books")
    private List<AuthorEntity> authors;
    @OneToMany(mappedBy = "book")
    private List<ConcreteBookEntity> concreteBooks;

    public BookEntity(){}

    public BookEntity(@NotNull PublishingHouseEntity publishingHouseEntity, @NotNull BookCategoryEntity bookCategoryEntity, @NotNull String title) {
        this.publishingHouseEntity = publishingHouseEntity;
        this.bookCategoryEntity = bookCategoryEntity;
        this.title = title;
    }

    public Long getId() {
        return id;
    }



    public PublishingHouseEntity getPublishingHouseEntity() {
        return publishingHouseEntity;
    }

    public void setPublishingHouseEntity(PublishingHouseEntity publishingHouseEntity) {
        this.publishingHouseEntity = publishingHouseEntity;
    }

    public BookCategoryEntity getBookCategoryEntity() {
        return bookCategoryEntity;
    }

    public void setBookCategoryEntity(BookCategoryEntity bookCategoryEntity) {
        this.bookCategoryEntity = bookCategoryEntity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }

    public List<ConcreteBookEntity> getConcreteBooks() {
        return concreteBooks;
    }

    public void setConcreteBooks(List<ConcreteBookEntity> concreteBooks) {
        this.concreteBooks = concreteBooks;
    }
}
