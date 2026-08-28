
package com.mycompany.vetcare.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Pet {
    private Integer id;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private LocalDate birthDate;
    private Double weight;
    private Owner owner;
    private Boolean status;
    private LocalDateTime createdAt;

    public Pet() {
    }
    
    public Pet(String name, String species, String breed, String gender, LocalDate birthDate, Double weight, Owner owner, Boolean status, LocalDateTime createdAt) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
        this.owner = owner;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Pet(Integer id, String name, String species, String breed, String gender, LocalDate birthDate, Double weight, Owner owner, Boolean status, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
        this.owner = owner;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public Boolean getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    
    
}
