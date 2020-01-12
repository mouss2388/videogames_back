package com.edugroup.models.projection;

import org.springframework.data.rest.core.config.Projection;

import com.edugroup.models.JeuxVideo;

@Projection(name = "VideoGamesAllData", types = JeuxVideo.class)

public interface VideoGamesAllData extends JeuxVideoAvecGenre, JeuxVideoAvecPlateforme {

}
