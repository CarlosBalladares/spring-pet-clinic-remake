package com.carlosballadares.springpetclinicremake.services;

import com.carlosballadares.springpetclinicremake.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
