package com.edugroup.models.projection;

import org.springframework.data.rest.core.config.Projection;

import com.edugroup.models.Genre;
import com.edugroup.models.JeuxVideo;

@Projection(name = "videoGamesWithGenres", types = JeuxVideo.class)
public interface JeuxVideoAvecGenre extends JeuxVideoInterface {
	Genre getGenres();
}
