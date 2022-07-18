package com.suranjana.recycler;

public class AnimalModel {
    String species;
    String name;
    String breed;
    String color;
    Boolean genderIsMale;

    public AnimalModel(String species, String name, String breed, String color, Boolean genderIsMale) {
        this.species = species;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.genderIsMale = genderIsMale;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getGenderIsMale() {
        return genderIsMale;
    }

    public void setGenderIsMale(Boolean genderIsMale) {
        this.genderIsMale = genderIsMale;
    }
}
