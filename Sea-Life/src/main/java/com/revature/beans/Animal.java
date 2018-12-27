package com.revature.beans;

public class Animal {
	
	public Animal(String genus, String characteristic, String habitat, String species, String diet, String appearence) {
		super();
		this.genus = genus;
		this.characteristic = characteristic;
		this.habitat = habitat;
		this.species = species;
		this.diet = diet;
		this.appearence = appearence;
	}
	private String genus;
	private String characteristic;
	private String habitat;
	private String species;
	private String diet;
	private String appearence;
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public String getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getAppearence() {
		return appearence;
	}
	public void setAppearence(String appearence) {
		this.appearence = appearence;
	}
	@Override
	public String toString() {
		return "Animal [genus=" + genus + ", characteristic=" + characteristic + ", habitat=" + habitat + ", species="
				+ species + ", diet=" + diet + ", appearence=" + appearence + "]";
	}

}
