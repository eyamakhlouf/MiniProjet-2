package com.eya.livres.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.eya.livres.entities.Genre;
import com.eya.livres.entities.Livre;
import com.eya.livres.repos.LivreRepository;
@Service
public class LivreServiceImpl implements LivreService {
	@Autowired
	LivreRepository livreRepository;
	@Override
	public Livre saveLivre(Livre l) {
	return livreRepository.save(l);
	}
	@Override
	public Livre updateLivre(Livre l) {
	return livreRepository.save(l);
	}
	@Override
	public void deleteLivre(Livre l) {
	livreRepository.delete(l);
	}
	 @Override
	public void deleteLivreById(Long id) {
	livreRepository.deleteById(id);
	}
	@Override
	public Livre getLivre(Long id) {
	return livreRepository.findById(id).get();
	}
	@Override
	public List<Livre> getAllLivres() {
	return livreRepository.findAll();
	}

	public Page<Livre> getAllLivresParPage(int page, int size)
	{
		return livreRepository.findAll(PageRequest.of(page, size));

	}
	
	@Override
	public List<Livre> findByTitreLivre(String nom) {
	return livreRepository.findByTitreLivre(nom);
	}
	@Override
	public List<Livre> findByTitreLivreContains(String nom) {
	return livreRepository.findByTitreLivreContains(nom);
	}
	@Override
	public List<Livre> findByTitrePrix(String nom, Double prix) {
	return livreRepository.findByTitrePrix(nom, prix);
	}
	@Override
	public List<Livre> findByGenre(Genre genre) {
	return livreRepository.findByGenre(genre);
	}
	@Override
	public List<Livre> findByGenreIdGen(Long id) {
	return livreRepository.findByGenreIdGen(id);
	}
	@Override
	public List<Livre> findByOrderByTitreLivreAsc() {
	return livreRepository.findByOrderByTitreLivreAsc();
	}
	@Override
	public List<Livre> trierLivresTitresPrix() {
	return livreRepository.trierLivresTitresPrix();
	}




	}

