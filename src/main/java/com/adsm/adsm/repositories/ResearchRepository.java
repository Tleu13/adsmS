package com.adsm.adsm.repositories;

import com.adsm.adsm.model.Research;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchRepository extends CrudRepository<Research,Long> {
}
