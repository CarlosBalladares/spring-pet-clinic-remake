package com.carlosballadares.springpetclinicremake.model;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;
@Entity
public class Pet extends BaseEntity {


    private String petType;
    @OneToOne
    private Owner owner;

    private LocalDate birthDate;


    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
