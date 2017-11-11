package com.adsm.adsm.repositories;

import com.adsm.adsm.model.Protocol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolRepository extends CrudRepository<Protocol,Long> {
}
