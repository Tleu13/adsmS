package com.adsm.adsm.services;

import com.adsm.adsm.model.TaskPrototype;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskProtService{
    TaskPrototype addTask (TaskPrototype taskPrototype);
    TaskPrototype showTask();
    void delete(long id);
    TaskPrototype getByName(String name);
    TaskPrototype editBank(TaskPrototype taskPrototype);
    List<TaskPrototype> getAll();

}
