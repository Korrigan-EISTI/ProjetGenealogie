package com.dreamteam.findyourfather.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Personne implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private Long numeroSecu;
	private String nom;
	private String prenom;
	private Long age;
	private String dateNaissance;
	private String dateDeces;
	private String nationalite;
	private boolean genre;
	public Personne pere;
	public Personne mere;
	
	
	public Personne(Long numeroSecu, String nom, String prenom){
		super();
		this.nom = nom;
		this.numeroSecu = numeroSecu;
		this.prenom = prenom;
	}
	
	public Personne() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumeroSecu() {
		return numeroSecu;
	}
	public void setNumeroSecu(Long numeroSecu) {
		this.numeroSecu = numeroSecu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getDateDeces() {
		return dateDeces;
	}
	public void setDateDeces(String dateDeces) {
		this.dateDeces = dateDeces;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public boolean isGenre() {
		return genre;
	}
	public void setGenre(boolean genre) {
		this.genre = genre;
	}
	
}
