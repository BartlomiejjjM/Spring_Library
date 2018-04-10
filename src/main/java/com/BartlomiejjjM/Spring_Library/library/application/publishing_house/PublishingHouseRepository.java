package com.BartlomiejjjM.Spring_Library.library.application.publishing_house;

import com.BartlomiejjjM.Spring_Library.library.application.author.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingHouseRepository extends JpaRepository<PublishingHouseEntity, Long> {
}
