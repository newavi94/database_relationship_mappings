package com.databaserelationship.dbrelationonetomany.repository;

import com.databaserelationship.dbrelationonetomany.resources.entity.Interns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Interns, Long> {
}
