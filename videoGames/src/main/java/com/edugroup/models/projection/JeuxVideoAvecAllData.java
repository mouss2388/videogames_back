package com.edugroup.models.projection;

import org.springframework.data.rest.core.config.Projection;

import com.edugroup.models.JeuxVideo;

@Projection(name = "JeuxVideoAvecAllData", types = JeuxVideo.class)

public interface JeuxVideoAvecAllData extends JeuxVideoInterface, JeuxVideoAvecGenre, JeuxVideoAvecPlateforme {

}
