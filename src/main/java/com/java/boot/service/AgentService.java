package com.java.boot.service;

import java.util.List;

import com.java.boot.model.Agent;


public interface AgentService {
	List<Agent> getAllAgent();
	void saveAgent(Agent agent);
	Agent getAgentById(int agentId);
	void deleteByAgentId(int agentId);
	

}
