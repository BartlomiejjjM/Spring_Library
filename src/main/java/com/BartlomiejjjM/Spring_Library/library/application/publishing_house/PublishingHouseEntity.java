package com.BartlomiejjjM.Spring_Library.library.application.publishing_house;

import javax.persistence.*;

@Entity
@Table(name = "publishinghouse", catalog = "postgresql")
public class PublishingHouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

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
}
