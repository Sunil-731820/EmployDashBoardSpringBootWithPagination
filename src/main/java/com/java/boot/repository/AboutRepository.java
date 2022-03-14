package com.java.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.boot.model.About;

public interface AboutRepository extends JpaRepository<About, Integer>{

}
