package com.adsm.adsm.repositories;

import com.adsm.adsm.model.DrugAdministration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugAdministrationRepository extends CrudRepository<DrugAdministration, Long> {

}
