package com.bigfafs.springpetclinic.services;

import com.bigfafs.springpetclinic.objectModel.Owner;

import java.util.Set;

public interface OwnerService extends CrudService{
    Owner findByLastname (String lastName);

}
