package com.carlosballadares.springpetclinicremake.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Owner extends Person {

    @OneToOne
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
