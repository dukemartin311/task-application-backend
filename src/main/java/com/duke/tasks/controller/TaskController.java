package com.duke.tasks.controller;

import com.duke.tasks.entity.Task;
import com.duke.tasks.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<Task> fetchAllTasks() {
        return this.taskService.getAllTasks();
    }

    @PostMapping(path = "/addTask", consumes = "application/json", produces = "application/json")
    public Task addTask(@RequestBody Task task) {
        return this.taskService.addTask(task);
    }

    @DeleteMapping("/deleteTask/{id}")
    void deleteEmployee(@PathVariable String id) {
        this.taskService.deleteTaskById(id);
    }
}
