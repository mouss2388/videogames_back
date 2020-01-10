package com.edugroup.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edugroup.models.Editeur;
@RepositoryRestResource
public interface EditeurRepository extends PagingAndSortingRepository<Editeur, Integer> {

}
