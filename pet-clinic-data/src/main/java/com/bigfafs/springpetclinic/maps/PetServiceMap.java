package com.bigfafs.springpetclinic.maps;

import com.bigfafs.springpetclinic.objectModel.Pet;
import com.bigfafs.springpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Pet save(Pet object) {
       return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteBy(Long Id) {
        super.deleteById(Id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }
}
