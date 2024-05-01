package com.eya.livres.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivre;
	private String titreLivre;
	private String auteur;
	private Double prixLivre;
	private Date datePublication;
	@ManyToOne
	private Genre genre;


	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Livre(String titreLivre, String auteur, Double prixLivre, Date datePublication) {
		super();
		this.titreLivre = titreLivre;
		this.auteur = auteur;
		this.prixLivre = prixLivre;
		this.datePublication = datePublication;
	}

	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", titreLivre=" + titreLivre + ", auteur=" + auteur + ", prixLivre="
				+ prixLivre + "]";
	}

	public Long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}

	public String getTitreLivre() {
		return titreLivre;
	}

	public void setTitreLivre(String titreLivre) {
		this.titreLivre = titreLivre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Double getPrixLivre() {
		return prixLivre;
	}

	public void setPrixLivre(Double prixLivre) {
		this.prixLivre = prixLivre;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	public Livre() {
	super();
	}
}
