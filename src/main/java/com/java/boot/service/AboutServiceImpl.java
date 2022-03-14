package com.java.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.boot.model.About;

import com.java.boot.repository.AboutRepository;

@Service
public class AboutServiceImpl implements AboutService {
	@Autowired
	private AboutRepository aboutRepository;
	
	 @Override
	    public List<About> getAllAbout() {
	        return aboutRepository.findAll();
	    }
	

}
