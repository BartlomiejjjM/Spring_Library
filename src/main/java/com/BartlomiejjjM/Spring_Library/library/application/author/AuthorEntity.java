package com.BartlomiejjjM.Spring_Library.library.application.author;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "author", catalog = "postgresql")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String surname;

    public AuthorEntity(){

    }
    public AuthorEntity(@NotNull String name, @NotNull String surname) {
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}