package com.bigfafs.springpetclinic.services;

import com.bigfafs.springpetclinic.objectModel.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long pet);

    Pet saveVet(Pet vet);

    Set<Pet> findAll();
}
