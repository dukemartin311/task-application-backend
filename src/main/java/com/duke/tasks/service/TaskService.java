package com.duke.tasks.service;

import com.duke.tasks.entity.Task;
import com.duke.tasks.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.insert(task);
    }

    public void deleteTaskById(String id) {
        taskRepository.deleteById(id);
    }
}
