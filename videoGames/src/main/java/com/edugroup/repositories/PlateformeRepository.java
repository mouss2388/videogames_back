package com.edugroup.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edugroup.models.Plateforme;

@RepositoryRestResource
public interface PlateformeRepository extends PagingAndSortingRepository<Plateforme, Integer> {

}
