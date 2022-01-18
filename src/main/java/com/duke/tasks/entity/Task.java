package com.duke.tasks.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Task {
    @Id
    private String id;
    private String name;
    private String description;
    private String priority;

    public Task(String name,
                String description,
                String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }
}
