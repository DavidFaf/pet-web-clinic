package com.bigfafs.springpetclinic.services;

import com.bigfafs.springpetclinic.objectModel.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastname (String lastName);

    Owner findById(Long Id);

    Owner saveVet(Owner vet);

    Set<Owner> findAll();
}
