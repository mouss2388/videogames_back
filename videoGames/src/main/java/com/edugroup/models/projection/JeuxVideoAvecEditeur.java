package com.edugroup.models.projection;

import org.springframework.data.rest.core.config.Projection;

import com.edugroup.models.Editeur;
import com.edugroup.models.JeuxVideo;

@Projection(name = "videoGamesWithEditor", types = JeuxVideo.class)
public interface JeuxVideoAvecEditeur extends JeuxVideoInterface {
	Editeur getEditeur();
}
