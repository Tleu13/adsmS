package com.adsm.adsm.repositories;

import com.adsm.adsm.model.Diagnosis;
import com.adsm.adsm.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DiagnosysRepository extends CrudRepository<Diagnosis,Long> {

}
