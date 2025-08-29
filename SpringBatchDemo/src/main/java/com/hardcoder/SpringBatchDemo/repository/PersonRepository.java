package com.hardcoder.SpringBatchDemo.repository;

import com.hardcoder.SpringBatchDemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
