package com.java.boot.service;
import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.boot.model.Agent;
import com.java.boot.model.Employee;
import com.java.boot.repository.AgentRepository;

@Service
public class AgentServiceImpl implements AgentService{
	
	@Autowired
	private AgentRepository agentRepository;

	@Override
	public List<Agent> getAllAgent() {
		return agentRepository.findAll();
	}

	@Override
	public void saveAgent(Agent agent) {
		this.agentRepository.save(agent);
		
	}

	@Override
	public Agent getAgentById(int agentId) {
		Optional<Agent> optional = agentRepository.findById(agentId);
		Agent agent = null;
		if(optional.isPresent()) {
			agent = optional.get();
		}else {
			throw new RuntimeException("agent ID Does NOt exits ");
		}
		return agent;
	}
//	

	@Override
	public void deleteByAgentId(int agentId) {
		this.agentRepository.deleteById(agentId);
		
	}

}
