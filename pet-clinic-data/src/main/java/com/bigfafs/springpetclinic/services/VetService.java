package com.bigfafs.springpetclinic.services;

import com.bigfafs.springpetclinic.objectModel.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);

    Vet saveVet(Vet vet);

    Set<Vet> findAll();
}
