package com.BartlomiejjjM.Spring_Library.library.application.author;

import com.BartlomiejjjM.Spring_Library.library.application.book.BookEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

@Entity
@Table(name = "author", catalog = "postgresql")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String author_name;
    @NotNull
    private String surname;

    @ManyToMany
    private List<BookEntity> books;

    public AuthorEntity(){

    }
    public AuthorEntity(@NotNull String name, @NotNull String surname) {
        this.author_name = name;
        this.surname = surname;
    }
    public AuthorEntity(Long id, @NotNull String name, @NotNull String surname){
        this.id=id;
        this.author_name = name;
        this.surname = surname;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return author_name;
    }

    public void setName(String name) {
        this.author_name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }
}
