package com.edugroup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edugroup.models.JeuxVideo;
import com.edugroup.repositories.JeuxVideoRepository;

@RestController
@RequestMapping("/video-games")
@CrossOrigin
public class JeuxVideoController {

	private final ProjectionFactory projectionFactory;

	@Autowired
	public JeuxVideoController(ProjectionFactory projectionFactory) {
		this.projectionFactory = projectionFactory;
	}

	@Autowired
	private JeuxVideoRepository jeuxRepo;
	
	
	@GetMapping
	public Page<JeuxVideo> afficheList(@PageableDefault Pageable page){
		return jeuxRepo.findAll(page);
	}
	
	@GetMapping(value = "/{id:[0-9]+}")
	public ResponseEntity<JeuxVideo> findById(@PathVariable("id") int id){
		return jeuxRepo.findById(id)
				.map( j -> new ResponseEntity<>(j,HttpStatus.ACCEPTED))
				.orElse(new ResponseEntity<JeuxVideo>(HttpStatus.NOT_FOUND));
	}

}
