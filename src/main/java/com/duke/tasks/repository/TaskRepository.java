package com.duke.tasks.repository;

import com.duke.tasks.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TaskRepository
        extends MongoRepository <Task, String>{
}
