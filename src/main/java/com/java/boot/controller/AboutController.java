package com.java.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.boot.service.AboutService;





@Controller
public class AboutController {
	
	@Autowired
	private AboutService aboutSevice;
	

	@GetMapping("/aboutDesginer")
	public String viewAboutPage(Model model) {
		model.addAttribute("listAbout", aboutSevice.getAllAbout());
		return "about";
	}

}
