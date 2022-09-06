package com.bigfafs.springpetclinic.maps;

import com.bigfafs.springpetclinic.objectModel.Owner;
import com.bigfafs.springpetclinic.objectModel.Vet;
import com.bigfafs.springpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteBy(Long Id) {
        super.deleteById(Id);
    }

    @Override
    public void delete(Vet object) {
            super.delete(object);
    }
}
