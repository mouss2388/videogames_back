package com.edugroup.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edugroup.models.JeuxVideo;
@RepositoryRestResource
public interface JeuxVideoRepository extends PagingAndSortingRepository<JeuxVideo, Integer> {

}
