package com.edugroup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edugroup.models.Editeur;
import com.edugroup.repositories.EditeurRepository;

@RestController
@RequestMapping("/editors")
@CrossOrigin
public class EditeurController {
	
	@Autowired
	private EditeurRepository editeurRepo;
	
	@GetMapping
	public Iterable<Editeur> listEditors(){
		return editeurRepo.findAll();
	}

}
