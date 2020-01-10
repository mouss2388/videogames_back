package com.edugroup.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edugroup.models.Genre;
@RepositoryRestResource
public interface GenreRepository extends PagingAndSortingRepository<Genre, Integer> {

}
