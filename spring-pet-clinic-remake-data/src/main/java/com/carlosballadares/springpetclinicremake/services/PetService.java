package com.carlosballadares.springpetclinicremake.services;

import com.carlosballadares.springpetclinicremake.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();


}
