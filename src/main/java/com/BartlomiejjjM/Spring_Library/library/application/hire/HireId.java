package com.BartlomiejjjM.Spring_Library.library.application.hire;

import com.BartlomiejjjM.Spring_Library.library.application.concrete_book.ConcreteBookEntity;
import com.BartlomiejjjM.Spring_Library.library.application.user.UserEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public  class HireId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity users;
    @OneToOne
    @JoinColumn(name = "catalog_number")
    private ConcreteBookEntity concreteBook;

    public HireId() {
    }

    public HireId(UserEntity users, ConcreteBookEntity concreteBook) {
        this.users = users;
        this.concreteBook = concreteBook;
    }

    public UserEntity getUsers() {
        return users;
    }

    public void setUsers(UserEntity users) {
        this.users = users;
    }

    public ConcreteBookEntity getConcreteBook() {
        return concreteBook;
    }

    public void setConcreteBook(ConcreteBookEntity concreteBook) {
        this.concreteBook = concreteBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HireId hireId = (HireId) o;

        if (users != null ? !users.equals(hireId.users) : hireId.users != null) return false;
        return concreteBook != null ? concreteBook.equals(hireId.concreteBook) : hireId.concreteBook == null;
    }

    @Override
    public int hashCode() {
        int result = users != null ? users.hashCode() : 0;
        result = 31 * result + (concreteBook != null ? concreteBook.hashCode() : 0);
        return result;
    }
}
