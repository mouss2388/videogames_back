package com.edugroup.models.projection;

import org.springframework.data.rest.core.config.Projection;

import com.edugroup.models.JeuxVideo;
import com.edugroup.models.Plateforme;

@Projection(name = "videoGamesWithPlateforms", types = JeuxVideo.class)
public interface JeuxVideoAvecPlateforme extends JeuxVideoInterface {
	Plateforme getPlateformes();
}
