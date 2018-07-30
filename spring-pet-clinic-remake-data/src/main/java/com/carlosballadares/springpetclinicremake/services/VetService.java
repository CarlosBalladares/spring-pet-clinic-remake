package com.carlosballadares.springpetclinicremake.services;

import com.carlosballadares.springpetclinicremake.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
