package com.bigfafs.springpetclinic.maps;

import com.bigfafs.springpetclinic.objectModel.Owner;
import com.bigfafs.springpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll() ;
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteBy(Long Id) {
        super.deleteById(Id);
    }
}
