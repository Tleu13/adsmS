package com.adsm.adsm.repositories;

import com.adsm.adsm.model.Staff;
import com.adsm.adsm.model.TaskPrototype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface TaskPrototypeRepository extends JpaRepository<TaskPrototype, Long> {



}


