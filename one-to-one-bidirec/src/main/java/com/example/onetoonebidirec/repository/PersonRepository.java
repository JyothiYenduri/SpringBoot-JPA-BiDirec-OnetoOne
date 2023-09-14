package com.example.onetoonebidirec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoonebidirec.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
