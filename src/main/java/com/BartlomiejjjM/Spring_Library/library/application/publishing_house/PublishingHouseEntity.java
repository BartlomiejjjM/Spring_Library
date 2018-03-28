package com.BartlomiejjjM.Spring_Library.library.application.publishing_house;

import com.BartlomiejjjM.Spring_Library.library.application.book.BookEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "publishinghouse", catalog = "postgresql")
public class PublishingHouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany
    private List<BookEntity> books;

    public  PublishingHouseEntity(){

    }
    public PublishingHouseEntity(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }
}
