package com.neo.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.spring.api.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long>{

}
