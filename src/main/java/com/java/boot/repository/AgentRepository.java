package com.java.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.boot.model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Integer> {

}
