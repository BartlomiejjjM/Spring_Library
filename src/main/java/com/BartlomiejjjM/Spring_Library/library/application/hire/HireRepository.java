

package com.BartlomiejjjM.Spring_Library.library.application.hire;
import com.BartlomiejjjM.Spring_Library.library.application.hire.HireEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.IdClass;

@Repository
public interface HireRepository extends JpaRepository<HireEntity, Long> {
}
