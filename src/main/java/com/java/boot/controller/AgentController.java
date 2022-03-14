package com.java.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.boot.model.Agent;
import com.java.boot.model.Employee;
import com.java.boot.repository.AgentRepository;
import com.java.boot.service.AgentService;

@Controller
public class AgentController {
	
	@Autowired 
	private AgentService agentService;
	
	@GetMapping("/ShowAgenttable")
	public String viewAboutPage(Model model) {
		model.addAttribute("listAgent", agentService.getAllAgent());
		return "agent";
	}
	
	@GetMapping("/showNewAgentForm")
	public String showNewAgentForm(Model model) {
		Agent agent = new Agent();
		model.addAttribute("agent", agent);
		return "new_agent";
		
	}
	

	@PostMapping("/saveAgent")
	public String saveAgent(@ModelAttribute("agent") Agent agent) {
		agentService.saveAgent(agent);
		return "redirect:ShowAgenttable";
	}
	
	
	@GetMapping("/showFormForUpdate1/{agentId}")
	public String showFormUpdate1(@PathVariable ( value = "agentId") int agentId, Model model) {
		Agent agent = agentService.getAgentById(agentId);
		model.addAttribute("agent", agent);
		return "update_agent";
	}
	
	
	@GetMapping("/deleteAgent/{agentId}")
	public String deleteAgent(@PathVariable (value = "agentId") int agentId) { 
	     // call delete agent method 
	     this.agentService.deleteByAgentId(agentId);
	     return "redirect:/";
	    }

}
