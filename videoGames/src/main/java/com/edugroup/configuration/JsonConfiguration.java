package com.edugroup.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.edugroup.models.Editeur;
import com.edugroup.models.Genre;
import com.edugroup.models.JeuxVideo;
import com.edugroup.models.Plateforme;

@Configuration
public class JsonConfiguration implements RepositoryRestConfigurer {

	@Bean
	public SpelAwareProxyProjectionFactory projectionFactory() {
		return new SpelAwareProxyProjectionFactory();
	}
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		config.exposeIdsFor(JeuxVideo.class, Editeur.class, Genre.class, Plateforme.class);
	}

	
}
