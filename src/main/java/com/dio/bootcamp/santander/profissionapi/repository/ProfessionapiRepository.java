package com.dio.bootcamp.santander.profissionapi.repository;

import com.dio.bootcamp.santander.profissionapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionapiRepository extends JpaRepository<Person, Long> {
}
