package com.eya.livres.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "TitreLiv", types = { Livre.class })
public interface LivreProjection {
	public String getTitreLivre();
}


