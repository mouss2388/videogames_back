package com.edugroup.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class JeuxVideo {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private LocalDate dateSortie;
	
	@ManyToOne
	private Editeur editeur;

	@ManyToMany @JsonIgnore
	private Set<Genre> genres;
	@ManyToMany @JsonIgnore
	private Set<Plateforme> plateformes;
	
	

}
