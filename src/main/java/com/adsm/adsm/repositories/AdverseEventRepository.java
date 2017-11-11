package com.adsm.adsm.repositories;

import com.adsm.adsm.model.AdverseEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdverseEventRepository extends CrudRepository<AdverseEvent,Long>{

}
