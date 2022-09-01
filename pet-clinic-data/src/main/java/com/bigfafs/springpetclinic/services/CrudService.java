package com.bigfafs.springpetclinic.services;

import com.bigfafs.springpetclinic.objectModel.Owner;

import java.util.Set;

public interface CrudService <T, ID>{

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteBy(ID id);
}
