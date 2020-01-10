package com.edugroup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edugroup.models.Genre;
import com.edugroup.repositories.GenreRepository;

@RestController
@RequestMapping("/genres")
@CrossOrigin
public class GenreController {
	@Autowired
	private GenreRepository genreRepo;
	
	@GetMapping
	public Iterable<Genre> listGenres(){
		return genreRepo.findAll();
	}

}
