package com.BartlomiejjjM.Spring_Library.library.application.hire;

import com.BartlomiejjjM.Spring_Library.library.application.concrete_book.ConcreteBookEntity;
import com.BartlomiejjjM.Spring_Library.library.application.user.UserEntity;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "hire", catalog = "postgresql")
public class HireEntity {
    @EmbeddedId
    private HireId hireId;
    @Id
    private LocalDate hireDate;

    private LocalDate returnDate;

    public HireEntity() {
    }

    public HireEntity(HireId hireId, LocalDate hireDate) {
        this.hireId = hireId;
        this.hireDate = hireDate;
    }

    public HireId getHireId() {
        return hireId;
    }

    public void setHireId(HireId hireId) {
        this.hireId = hireId;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
