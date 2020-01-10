package com.edugroup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edugroup.models.Plateforme;
import com.edugroup.repositories.PlateformeRepository;

@RestController
@RequestMapping("/platforms")
@CrossOrigin
public class PlateformeController {

	@Autowired
	private PlateformeRepository plateformeRepo;
	
	@GetMapping
	public Iterable<Plateforme> listPlateforms(){
		return plateformeRepo.findAll();
	}
	
}
