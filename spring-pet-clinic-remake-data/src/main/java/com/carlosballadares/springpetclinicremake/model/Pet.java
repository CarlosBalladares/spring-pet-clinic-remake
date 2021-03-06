package com.carlosballadares.springpetclinicremake.model;

import com.sun.xml.internal.rngom.parse.host.Base;

import java.time.LocalDate;

public class Pet extends Base {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
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
