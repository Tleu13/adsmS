package com.adsm.adsm.repositories;

import com.adsm.adsm.model.EventPrototype;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPrototypeRepository extends CrudRepository<EventPrototype,Long> {
}
