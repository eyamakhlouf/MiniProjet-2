package com.eya.livres.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.eya.livres.entities.Genre;
import com.eya.livres.entities.Livre;

public interface LivreService {
	Livre saveLivre(Livre p);

	Livre updateLivre(Livre p);

	void deleteLivre(Livre p);

	void deleteLivreById(Long id);

	Livre getLivre(Long id);

	List<Livre> getAllLivres();

	Page<Livre> getAllLivresParPage(int page, int size);
	
	List<Livre> findByTitreLivre(String nom);
	List<Livre> findByTitreLivreContains(String nom);
	List<Livre> findByTitrePrix (String nom, Double prix);
	List<Livre> findByGenre (Genre genre);
	List<Livre> findByGenreIdGen(Long id);
	List<Livre> findByOrderByTitreLivreAsc();
	List<Livre> trierLivresTitresPrix();
	
}




